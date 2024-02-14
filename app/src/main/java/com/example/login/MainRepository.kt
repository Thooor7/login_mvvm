package com.example.login

class MainRepository {

    fun login(name: String): Boolean{
        return name != ""
    }
}