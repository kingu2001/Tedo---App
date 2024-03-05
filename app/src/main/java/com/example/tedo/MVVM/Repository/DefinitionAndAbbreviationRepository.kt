package com.example.tedo.MVVM.Repository

import com.example.tedo.MVVM.Model.DefinitionAndAbbreviation

class DefinitionAndAbbreviationRepository{
    var defAndAbb = mutableListOf<DefinitionAndAbbreviation>()
    fun create(defAndAbb : String) : DefinitionAndAbbreviation?{

    }

    fun getById(id: Int): DefinitionAndAbbreviation? {
        TODO("Not yet implemented")
    }

    fun getAll(): List<DefinitionAndAbbreviation> {
        TODO("Not yet implemented")
    }

    fun delete(id: Int) {
        TODO("Not yet implemented")
    }

    fun update(data: DefinitionAndAbbreviation) {
        TODO("Not yet implemented")
    }

}