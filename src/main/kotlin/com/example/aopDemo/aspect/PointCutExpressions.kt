package com.example.aopDemo.aspect

import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component

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
   *
*/

@Component
open class PointCutExpressions {

    @Pointcut("execution(* com.example.aopDemo.dao.*.*(..))")
    open fun forDaoPackage() {
    }

    @Pointcut("execution(* com.example.aopDemo.dao.*.get*(..))")
    open fun getter() {}

    @Pointcut("execution(* com.example.aopDemo.dao.*.set*(..))")
    open fun setter() {}

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    open fun forDaoPackageExcludingGetterAndSetter() {}
}