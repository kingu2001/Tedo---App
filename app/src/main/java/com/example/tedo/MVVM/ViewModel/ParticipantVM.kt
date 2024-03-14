package com.example.tedo.MVVM.ViewModel

import android.text.format.DateFormat
import com.example.tedo.MVVM.Model.Firm
import com.example.tedo.MVVM.Model.Participant

class ParticipantVM(participant: Participant){
    val name: String? = participant.Name
    val firm: Firm? = participant.Firm
    val signature: String? = participant.Signature
    val date: DateFormat? = participant.Date
 }
