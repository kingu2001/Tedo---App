package com.example.tedo.MVVM.Model

data class User(
    var username: String,
    var password: String,
    var reenterPassword: String? = ""
)