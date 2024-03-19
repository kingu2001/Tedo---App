package com.example.tedo.MVVM.ViewModel

import androidx.lifecycle.ViewModel
import com.example.tedo.MVVM.Model.User

class UserVM(user : User) : ViewModel() {
    val username = user.username
    val password = user.password
    val reenterUsername = user.reenterPassword
}