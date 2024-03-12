package com.example.tedo.MVVM.Model

data class Test(
    var Title: String,
    var TestDocument: TestDocument? = null,
    var TestProcedure: String,
    var Description: String,
    var IATInitials: String,
    var FATInitials: String,
    var SATInitials: String,
    var OATInitials: String
)
