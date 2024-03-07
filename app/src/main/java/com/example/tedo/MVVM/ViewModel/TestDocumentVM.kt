package com.example.tedo.MVVM.ViewModel

data class TestDocumentVM(
    var Name : String,
    var DocumentSupplied : String,
    var Punchlist : MutableList<PunchVM>? = null,
    var Participants : MutableList<ParticipantVM>? = null,
    var DefinitionsAndAbbreviations : MutableList<DefinitionAndAbbreviationVM>? = null,
    var Revisions : MutableList<RevisionVM>? = null,
    var Tests : MutableList<TestVM>? = null
)