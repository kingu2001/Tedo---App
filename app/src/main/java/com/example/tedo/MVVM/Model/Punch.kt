package com.example.tedo.MVVM.Model

data class Punch(
    var Test: Test? = null,
    var PunchNumber: Int,
    var Description: String,
    var Owner: String,
    var Action: String
)
