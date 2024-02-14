package com.example.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var textWelcome = MutableLiveData<String>()
    private val toastNotification = MutableLiveData<String>()
     private val repository = MainRepository()

    init {
        textWelcome.value = "Boa noite!"
    }

    fun welcome(): LiveData<String>{
        return textWelcome
    }

    fun login(): LiveData<String>{
        return toastNotification
    }

    fun doLogin(email: String){
        if(this.repository.login(email)){
            toastNotification.value = "SUCESSO!"
        } else {
            toastNotification.value = "FALHA!"
        }
    }
}