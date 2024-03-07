package com.example.tedo.MVVM.Model

import android.text.format.DateFormat

data class Participant(
    var Name: String,
    var Firm: Firm,
    var Signature: String,
    var Date: DateFormat
)
