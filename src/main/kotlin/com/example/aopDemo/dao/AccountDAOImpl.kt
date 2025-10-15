package com.example.aopDemo.dao

import org.springframework.stereotype.Component

@Component
class AccountDAOImpl() {
    private var accountId: String = "a1"
     fun addAccount() {
        System.out.println(javaClass.canonicalName + "  DOING DB WORK : ADDING ACCOUNT")
    }

     fun getAccountId(): String {
        return accountId
    }

     fun setAccountId(accountId: String) {
        this.accountId = accountId
    }
}