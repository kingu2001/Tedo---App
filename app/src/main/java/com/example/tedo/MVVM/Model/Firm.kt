package com.example.tedo.MVVM.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


data class Firm(
    val id : Int,
    var Name : String? = null,
    var FullAddress : String? = null,
    var SAT : Boolean? = null,
    var IAT : Boolean? = null,
    var OAT : Boolean? = null,
    var FAT : Boolean? = null,
    var Participants : MutableList<Participant> = mutableListOf()
)