package com.example.aopDemo.aspect

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component

@Aspect
@Component
class LoggingAspect {
    //    @Before("execution(public void addAccount())")
    @Before("com.example.aopDemo.aspect.PointCutExpressions.forDaoPackage()")
    open fun beforeAspect() {
        System.out.println("=====> Executing Before Advice <====== ")
    }

    @Before("com.example.aopDemo.aspect.PointCutExpressions.forDaoPackageExcludingGetterAndSetter()")
    open fun beforeAspectExcludingGettersAndSetters() {
        System.out.println("=====> Executing Before Advice Excluding Getter And Setters <====== ")
    }
}