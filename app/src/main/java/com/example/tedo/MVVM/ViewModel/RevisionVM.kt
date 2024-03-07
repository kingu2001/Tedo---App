package com.example.tedo.MVVM.ViewModel

import android.text.format.DateFormat

data class RevisionVM(
    var Number: Int,
    var PageAffected: String,
    var ChapterAffected: String,
    var Description: String,
    var TestDocument: TestDocumentVM? = null,
    var Date: DateFormat
)
