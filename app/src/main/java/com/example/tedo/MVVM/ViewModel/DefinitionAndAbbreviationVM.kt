package com.example.tedo.MVVM.ViewModel
import com.example.tedo.MVVM.Model.DefinitionAndAbbreviation
import com.example.tedo.MVVM.Model.TestDocument

class DefinitionAndAbbreviationVM(definitionAndAbbreviation: DefinitionAndAbbreviation){
    val definition : String? = definitionAndAbbreviation.Definition
    val abbreviation : String? = definitionAndAbbreviation.Abbreviation
    val TestDocument : TestDocument? = definitionAndAbbreviation.TestDocument
}
