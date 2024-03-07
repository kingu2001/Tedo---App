package com.example.tedo.MVVM.Repository
import com.example.tedo.MVVM.Model.Firm
import com.example.tedo.MVVM.Model.Participant

class FirmRepository{
    var firmList = mutableListOf<Firm>()
    fun create(
        name : String?,
        fullAddress : String?,
        sat : Boolean?,
        iat : Boolean?,
        oat : Boolean?,
        fat : Boolean?,
        participants : MutableList<Participant>) : Firm
    {
        val firm = Firm(
            Name = name,
            FullAddress = fullAddress,
            SAT = sat,
            IAT = iat,
            OAT = oat,
            FAT = fat,
            Participants = participants
        )
        firmList.add(firm)
        return firm
    }

     fun getByName(name : String) : Firm?{
        return firmList.find { it.Name == name }
    }

    fun getAll() : MutableList<Firm>{
        return firmList
    }

    fun delete(firm : Firm) : Firm? {
        /*return firms.firstOrNull {it.Name == name}?.also { firms.remove(it) }*/
        return firmList.find{it.Name == firm.Name}.also{firmList.remove(it)}
    }

    fun update(firm : Firm) : Firm?{
        val existingFirm = firmList.find { it.Name == firm.Name }
        return existingFirm.apply {
            var name = firm.Name
            var fullAddress = firm.FullAddress
            var sat = firm.SAT
            var iat = firm.IAT
            var oat = firm.OAT
            var fat = firm.FAT
        }
    }


}