package com.example.tedo.MVVM.Repository
import com.example.tedo.MVVM.Model.Firm
import com.example.tedo.MVVM.Model.Participant

class FirmRepository{
    var firms = mutableListOf<Firm>()
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

     fun getbyID() {
        TODO("Not yet implemented")
    }

     suspend fun getAll() {
        TODO("Not yet implemented")
    }

     fun update() {
        TODO("Not yet implemented")
    }

     fun delete() {
        TODO("Not yet implemented")
    }

}