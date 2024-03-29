package com.example.tedo.MVVM.Model

import android.text.format.DateFormat

data class Revision(
    var Number: Int,
    var PageAffected: String,
    var ChapterAffected: String,
    var Description: String,
    var TestDocument: TestDocument? = null,
    var Date: DateFormat
)
