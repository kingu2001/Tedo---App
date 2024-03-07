package com.example.tedo.MVVM.Model

data class TestDocument(
    var Name : String,
    var DocumentSupplied : String,
    var Punchlist : MutableList<Punch>? = null,
    var Participants : MutableList<Participant>? = null,
    var DefinitionsAndAbbreviations : MutableList<DefinitionAndAbbreviation>? = null,
    var Revisions : MutableList<Revision>? = null,
    var Tests : MutableList<Test>? = null
)