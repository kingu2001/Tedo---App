package com.example.tedo.MVVM.ViewModel

import com.example.tedo.MVVM.Model.DefinitionAndAbbreviation
import com.example.tedo.MVVM.Model.Participant
import com.example.tedo.MVVM.Model.Punch
import com.example.tedo.MVVM.Model.Revision
import com.example.tedo.MVVM.Model.Test
import com.example.tedo.MVVM.Model.TestDocument

/*data class TestDocumentVM(
    var testDocument: TestDocument,
    var Name : String,
    var DocumentSupplied : String,
    var Punchlist : MutableList<PunchVM>? = null,
    var Participants : MutableList<ParticipantVM>? = null,
    var DefinitionsAndAbbreviations : MutableList<DefinitionAndAbbreviationVM>? = null,
    var Revisions : MutableList<RevisionVM>? = null,
    var Tests : MutableList<TestVM>? = null
)*/

class TestDocumentVm(testDocument: TestDocument){
    val name : String? = testDocument.Name
    val documentSupplied : String? = testDocument.DocumentSupplied
    val punchList : MutableList<Punch>? = testDocument.Punchlist
    val participant : MutableList<Participant>? = testDocument.Participants
    val definitionAndAbbreviation : MutableList<DefinitionAndAbbreviation>? = testDocument.DefinitionsAndAbbreviations
    val revision : MutableList<Revision>? = testDocument.Revisions
    val tests : MutableList<Test>? = testDocument.Tests


}
