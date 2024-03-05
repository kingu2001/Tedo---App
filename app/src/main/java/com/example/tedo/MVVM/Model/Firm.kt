package com.example.tedo.MVVM.Model

data class Firm(
    val Id : Int,
    var Name : String,
    var FullAddress : String,
    var TestType : Enum<TestType>
)