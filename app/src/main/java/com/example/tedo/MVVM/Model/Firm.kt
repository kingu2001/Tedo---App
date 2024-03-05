package com.example.tedo.MVVM.Model

data class Firm(
    var Name : String? = null,
    var FullAddress : String? = null,
    var SAT : Boolean? = null,
    var IAT : Boolean? = null,
    var OAT : Boolean? = null,
    var FAT : Boolean? = null,
    var Participants : MutableList<Participant> = mutableListOf()
)