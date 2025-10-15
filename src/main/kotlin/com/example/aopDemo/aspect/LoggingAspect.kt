package com.example.aopDemo.aspect

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

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

//    @Before("com.example.aopDemo.aspect.PointCutExpressions.forDaoPackageExcludingGetterAndSetter()")
//    open fun beforeAspectExcludingGettersAndSetters() {
//        System.out.println("=====> Executing Before Advice Excluding Getter And Setters <====== ")
//    }
}