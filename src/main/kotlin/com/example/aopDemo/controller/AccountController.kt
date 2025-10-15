package com.example.aopDemo.controller

import com.example.aopDemo.dao.AccountDAOImpl
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class AccountController(
    val accountDAO: AccountDAOImpl
) {

    @GetMapping("/greet")
    fun greet() {
        val accountid = accountDAO.getAccountId()
        accountDAO.setAccountId("1")
        accountDAO.addAccount()
    }

    @PostMapping("/echo")
    fun echo(@RequestBody message: String): String {
        return "You said: $message"
    }
}