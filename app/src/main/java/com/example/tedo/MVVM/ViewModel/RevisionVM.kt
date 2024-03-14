package com.example.tedo.MVVM.ViewModel

import android.text.format.DateFormat
import com.example.tedo.MVVM.Model.Revision
import com.example.tedo.MVVM.Model.TestDocument

/*data class RevisionVM(
    var Number: Int,
    var PageAffected: String,
    var ChapterAffected: String,
    var Description: String,
    var TestDocument: TestDocumentVM? = null,
    var Date: DateFormat
)*/

class RevisionVM(revision: Revision){
    val number : Int = revision.Number
    val pageAffected: String = revision.PageAffected
    val chapterAffected: String = revision.ChapterAffected
    val description : String? = revision.Description
    val testDocument : TestDocument? = revision.TestDocument
    val date : DateFormat = revision.Date
}
