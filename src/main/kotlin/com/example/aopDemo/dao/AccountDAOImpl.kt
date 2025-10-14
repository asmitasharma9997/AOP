package com.example.aopDemo.dao

import org.springframework.stereotype.Repository

@Repository
class AccountDAOImpl : AccountDAO {
    override fun addAccount() {
        System.out.println(javaClass.canonicalName + "  DOING DB WORK : ADDING ACCOUNT")
    }
}