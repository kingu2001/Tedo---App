package com.example.tedo.MVVM.Model

data class TestDocument(
    var Name : String,
    var DocumentSupplied : String,
    var Punchlist : MutableList<Punch>,
    var Participants : MutableList<Participant>,
    var DefinitionsAndAbbreviations : MutableList<DefinitionAndAbbreviation>,
    var Revisions : MutableList<Revision>,
    var Tests : MutableList<Test>
)