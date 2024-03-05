package com.example.tedo.MVVM.Repository
import com.example.tedo.MVVM.Model.Firm
import com.example.tedo.MVVM.Model.Participant

class FirmRepository{
    val firms = mutableListOf<Firm>()
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
        firms.add(firm)
        return firm
    }

     fun getByName(name : String) : Firm?{
        return firms.find { it.Name == name }
    }

    fun getAll() : MutableList<Firm>{
        return firms
    }

    fun delete(firm : Firm) : Firm? {
        /*return firms.firstOrNull {it.Name == name}?.also { firms.remove(it) }*/
        return firms.find{it.Name == firm.Name}?.also{firms.remove(it)}
    }

    fun update(firm : Firm) : Firm?{
        val existingFirm = firms.find { it.Name == firm.Name }
        return existingFirm?.apply {
            var name = firm.Name
            var fullAddress = firm.FullAddress
            var sat = firm.SAT
            var iat = firm.IAT
            var oat = firm.OAT
            var fat = firm.FAT
        }
    }


}