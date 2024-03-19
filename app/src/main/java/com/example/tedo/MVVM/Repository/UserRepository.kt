package com.example.tedo.MVVM.Repository

import com.example.tedo.MVVM.Model.User

class UserRepository {
    var userList = mutableListOf<User>()
    fun create(
        username: String,
        password: String,
        reenterPassword: String? = ""
    ): User {
        val user = User(
            username = username,
            password = password,
            reenterPassword = reenterPassword
        )
        userList.add(user)
        return user
    }

    fun getUsers() : MutableList<User>{
        return userList
    }

    fun getUserByUsername(username : String) : User?{
        return userList.find { it.username == username}
    }

    fun deleteUser(username : String) : User?{
        return userList.find { it.username == username }.also { userList.remove(it)}
    }
}