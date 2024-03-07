package com.example.tedo.MVVM.Repository

import com.example.tedo.MVVM.Model.DefinitionAndAbbreviation

class DefinitionAndAbbreviationRepository{
    var defAndAbbList = mutableListOf<DefinitionAndAbbreviation>()
    fun create(
        def : String,
        abb : String
    ) : DefinitionAndAbbreviation?
    {
        val defAndAbb = DefinitionAndAbbreviation(
            Definition = def,
            Abbreviation = abb
        )
        defAndAbbList.add(defAndAbb)
        return defAndAbb
    }

    fun getByDefinition(definition : String): DefinitionAndAbbreviation? {
        return defAndAbbList.find { it.Definition == definition}
    }

    fun getAll(): MutableList<DefinitionAndAbbreviation> {
        return defAndAbbList
    }

    fun delete(definition : String) : DefinitionAndAbbreviation? {
        return defAndAbbList.find { it.Definition == definition}.also {defAndAbbList.remove(it)}
    }

    fun update(defAndAbb : DefinitionAndAbbreviation) : DefinitionAndAbbreviation? {
        val existingDefAndAbb = defAndAbbList.find { it.Definition == defAndAbb.Definition}
        return existingDefAndAbb.apply{
            var definition = defAndAbb.Definition
            var abbreviation = defAndAbb.Abbreviation
        }
    }

}