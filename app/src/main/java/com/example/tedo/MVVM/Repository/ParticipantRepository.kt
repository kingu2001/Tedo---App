package com.example.tedo.MVVM.Repository

import android.text.format.DateFormat
import com.example.tedo.MVVM.Model.Firm
import com.example.tedo.MVVM.Model.Participant

class ParticipantRepository {
    var participantList = mutableListOf<Participant>()
    fun create(
        name : String,
        firm : Firm,
        signature : String,
        date : DateFormat
        ) : Participant?
    {
        val participant = Participant(
            Name = name,
            Firm = firm,
            Signature = signature,
            Date = date
        )
        participantList.add(participant)
        return participant
    }


    fun getByName(name : String) : Participant?{
        return participantList.find { it.Name == name }
    }

    fun getAll() : MutableList<Participant>{
        return participantList
    }

    fun delete(participant : Participant) : Participant? {
        /*return firms.firstOrNull {it.Name == name}?.also { firms.remove(it) }*/
        return participantList.find{it.Name == participant.Name}.also{participantList.remove(it)}
    }

    fun update(participant : Participant) : Participant?{
        val existingParticipant = participantList.find { it.Name == participant.Name }
        return existingParticipant.apply {
            var name = participant.Name
            var firm = participant.Firm
            var signature = participant.Signature
            var date = participant.Date
        }
    }
}