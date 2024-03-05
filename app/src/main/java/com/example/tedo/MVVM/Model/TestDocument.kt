package com.example.tedo.MVVM.Model

data class TestDocument(
    val Id : Int,
    var Name : String,
    var DocumentSupplied : String,
    var Punchlist : MutableList<Punch>,
    var PlacesOfTesting : MutableList<PlaceOfTesting>,
    var Participants : MutableList<Participant>,
    var DefinitionsAndAbbreviations : MutableList<DefinitionAndAbbreviation>,
    var Revisions : MutableList<Revision>,
    var Tests : MutableList<Test>
)