package com.example.tedo.MVVM.Repository

import com.example.tedo.MVVM.Model.Firm
import com.example.tedo.MVVM.Model.Participant
import com.example.tedo.MVVM.Model.Punch

class PunchRepository {
    var punchList = mutableListOf<Punch>()
    fun create(
        punchNumber : Int,
        description : String,
        owner : String,
        action : String
        ) : Punch
    {
        val punch = Punch(
            PunchNumber = punchNumber,
            Description = description,
            Owner = owner,
            Action = action
        )
        punchList.add(punch)
        return punch
    }

    fun getByPunchNumber(number : Int) : Punch?{
        return punchList.find {it.PunchNumber == number}
    }

    fun getAll() : MutableList<Punch>{
        return punchList
    }

    fun delete(punch : Punch) : Punch? {
        /*return firms.firstOrNull {it.Name == name}?.also { firms.remove(it) }*/
        return punchList.find{it.PunchNumber == punch.PunchNumber}.also{punchList.remove(it)}
    }

    fun update(punch : Punch) : Punch?{
        val existingPunch = punchList.find { it.PunchNumber == punch.PunchNumber }
        return existingPunch.apply {
            var punchNumber = punch.PunchNumber
            var description = punch.Description
            var owner = punch.Owner
            var action = punch.Action
        }
    }
}