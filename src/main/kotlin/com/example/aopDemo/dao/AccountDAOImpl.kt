package com.example.aopDemo.dao

import org.springframework.stereotype.Component
import java.lang.RuntimeException

@Component
class AccountDAOImpl() {
    private var accountId: String = "a1"
    fun addAccount(): String {
        System.out.println(javaClass.canonicalName + "  DOING DB WORK : ADDING ACCOUNT")
        return accountId
    }

    fun getAccountId(): String {
        return accountId
    }

    fun setAccountId(accountId: String) {
        if (accountId == this.accountId) {
            throw RuntimeException("Already same value for accountId ")
        }
        this.accountId = accountId
    }
}