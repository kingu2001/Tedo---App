package com.example.tedo.MVVM.ViewModel

data class DefinitionAndAbbreviationVM(
    var Definition : String,
    var Abbreviation : String,
    var TestDocument : TestDocumentVM? = null
)