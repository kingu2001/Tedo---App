package com.example.tedo.MVVM.ViewModel

data class FirmVM(
    var Name : String? = null,
    var FullAddress : String? = null,
    var SAT : Boolean? = null,
    var IAT : Boolean? = null,
    var OAT : Boolean? = null,
    var FAT : Boolean? = null,
    var Participants : MutableList<ParticipantVM> = mutableListOf()
)