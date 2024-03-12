package com.example.tedo.MVVM.Repository

import androidx.compose.runtime.key
import com.example.tedo.MVVM.Model.DefinitionAndAbbreviation
import java.util.Dictionary

class DefinitionAndAbbreviationRepository{
    var defAndAbb : MutableMap<String, DefinitionAndAbbreviation> = mutableMapOf()
    fun create(def:String, abb:String) : DefinitionAndAbbreviation? {
        val defiAndAbbr = DefinitionAndAbbreviation(Definition = def, Abbreviation = abb)
        defAndAbb[def] = defiAndAbbr
        return defiAndAbbr
    }


    fun getByDefinition(definition: String): DefinitionAndAbbreviation? {
        return defAndAbb.values.find {it.Definition == definition}
    }

    fun getAll(): MutableMap<String,DefinitionAndAbbreviation> {
        return defAndAbb
    }

    fun delete(definition: String) {
        getByDefinition(definition)
        defAndAbb.remove(definition)
    }

    fun update(definition: String, newDefinition : DefinitionAndAbbreviation, ) {
        defAndAbb[definition] = newDefinition
    }

}