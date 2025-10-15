package com.example.aopDemo.aspect

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Aspect
@Component
@Order(1)
class AnalyticsAspect {

    @Before("com.example.aopDemo.aspect.PointCutExpressions.forDaoPackageExcludingGetterAndSetter()")
    open fun beforeFunctionAnalytics() {
        System.out.println("=====> Executing Before Advice Excluding Getter And Setters for Analytics <====== ")
    }
}