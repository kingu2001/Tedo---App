package com.example.tedo.MVVM.ViewModel

import android.text.format.DateFormat

data class ParticipantVM(
    var Name: String,
    var Firm: FirmVM,
    var Signature: String,
    var Date: DateFormat
)
