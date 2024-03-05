package com.example.tedo.MVVM.Model

data class Revision(
    var number: Int,
    var pageaffected: String,
    var ChapterAffected: String,
    var Description: String,
    var TestDocument: TestDocument,
    var Date: String
)
