package com.example.tedo.MVVM.ViewModel
import com.example.tedo.MVVM.Model.Firm
import com.example.tedo.MVVM.Model.Participant
class FirmVM(firm : Firm)
{
    val name : String? = firm.Name
    val fullAddress : String? = firm.FullAddress
    val sat : Boolean? = firm.SAT
    val iat : Boolean? = firm.IAT
    val fat : Boolean? = firm.FAT
    val oat : Boolean? = firm.OAT
    val participants : MutableList<Participant> = firm.Participants
}

