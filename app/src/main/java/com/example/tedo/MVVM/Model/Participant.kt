package com.example.tedo.MVVM.Model

data class Participant(
    var Id: Int,
    var Name: String,
    var Firm: Firm,
    var Signature: String,
    var Date: String
)