package com.example.aopDemo

import com.example.aopDemo.dao.AccountDAO
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class AopDemoApplication

fun main(args: Array<String>) {
    runApplication<AopDemoApplication>(*args)
}

