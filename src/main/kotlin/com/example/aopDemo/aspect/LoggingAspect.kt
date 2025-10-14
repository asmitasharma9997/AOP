package com.example.aopDemo.aspect

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component

@Aspect
@Component
class LoggingAspect {

    /*
    * Point cut expressions
    *  execution(
    * modifier pattern ?
    * return type pattern
    * declaring type pattern ?
    * method name pattern(param pattern)
    * throws pattern?
    * )
    * ?-optional
    * public void com.example.aopDemo.dao.AccountDao.addAddcount())
    * modifier return type declaring methodName(param)
    *
    * starting with add
    * void add*()
    *
    * any return type
    * * add*()
    *
    * Parameter
    * () -> no params
    * (*)-> 1 argument of any type
    * (..)-> 0 or more argument of any type
    *
    * Match on package
    * * com.example.aopDemo.dao.*.*(..)
    * return package. class.method (param)
    *
    *
    *
    *
    * */
    @Before("execution(public void addAccount())")
    fun beforeAspect() {
        System.out.println("=====> Executing Before Advice <====== ")
    }
}