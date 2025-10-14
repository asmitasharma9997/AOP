package com.example.aopDemo.aspect

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component

@Aspect
@Component
class LoggingAspect {

    @Before("execution(public void addAccount())")
    fun beforeAspect() {
        System.out.println("=====> Executing Before Advice <====== ")
    }
}