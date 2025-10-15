package com.example.aopDemo.aspect

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.AfterThrowing
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import java.util.*

@Aspect
@Component
@Order(2)
class LoggingAspect {
    //    @Before("execution(public void addAccount())")
    @Before("com.example.aopDemo.aspect.PointCutExpressions.forDaoPackage()")
    open fun beforeAspect(joinPoint: JoinPoint) {
        System.out.println("=====> Executing Before Advice <====== ")
        val methodSignature = joinPoint.signature
        val args = joinPoint.args
        System.out.println("Method signature : " + methodSignature)
        for (arg in args) {
            System.out.println("Argument: " + arg)
        }
    }

    @AfterReturning(
        pointcut = "com.example.aopDemo.aspect.PointCutExpressions.getter()",
        returning = "result"
    )
    open fun afterReturningAspect(joinPoint: JoinPoint, result: String) {
        System.out.println("=====> Executing After returning Advice <====== ")
        System.out.println("After returning on method " + joinPoint.signature)
        val modified  = result.uppercase(Locale.getDefault())
        System.out.println("Result: " + modified)
    }

    @AfterThrowing(
        pointcut = "com.example.aopDemo.aspect.PointCutExpressions.setter()",
        throwing = "exc"
    )
    open fun afterThrowingAspect(joinPoint: JoinPoint, exc: Throwable) {
        System.out.println("=====> Executing After Throwing Advice <====== ")
        System.out.println("After Throwing on method " + joinPoint.signature)
        System.out.println("Exception: " + exc.message)
        System.out.println("=====> Done After Throwing Advice <====== ")
    }
}