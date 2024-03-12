package com.example.tedo.MVVM.ViewModel

data class TestVM(
    var Title: String,
    var TestDocument: TestDocumentVM? = null,
    var TestProcedure: String,
    var Description: String,
    var IATInitials: String,
    var FATInitials: String,
    var SATInitials: String,
    var OATInitials: String
)
