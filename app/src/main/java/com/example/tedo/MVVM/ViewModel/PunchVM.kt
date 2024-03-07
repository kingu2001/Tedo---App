package com.example.tedo.MVVM.ViewModel

data class PunchVM(
    var Test: TestVM? = null,
    var PunchNumber: Int,
    var Description: String,
    var Owner: String,
    var Action: String
)
