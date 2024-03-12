package com.example.tedo.MVVM.Repository

import androidx.compose.runtime.key
import com.example.tedo.MVVM.Model.DefinitionAndAbbreviation
import java.util.Dictionary

class DefinitionAndAbbreviationRepository {
    var defAndAbb: MutableMap<String, DefinitionAndAbbreviation> = mutableMapOf()
    fun create(def: String, abb: String): DefinitionAndAbbreviation? {
        val defiAndAbbr = DefinitionAndAbbreviation(Definition = def, Abbreviation = abb)
        defAndAbb[def] = defiAndAbbr
        return defiAndAbbr
    }


    fun getByDefinition(definition: String): DefinitionAndAbbreviation? {
        return defAndAbb.values.find { it.Definition == definition }
    }

    fun getAll(): MutableMap<String, DefinitionAndAbbreviation> {
        return defAndAbb
    }

    fun delete(definition: String) {
        getByDefinition(definition)
        defAndAbb.remove(definition)
    }

    fun update(definition: String, newDefinition: DefinitionAndAbbreviation, ) {
        defAndAbb[definition] = newDefinition

        var defAndAbbList = mutableListOf<DefinitionAndAbbreviation>()
        fun create(
            def: String,
            abb: String
        ): DefinitionAndAbbreviation? {
            val defAndAbb = DefinitionAndAbbreviation(
                Definition = def,
                Abbreviation = abb
            )
            defAndAbbList.add(defAndAbb)
            return defAndAbb
        }

        fun getByDefinition(definition: String): DefinitionAndAbbreviation? {
            return defAndAbbList.find { it.Definition == definition }
        }

        fun getAll(): MutableList<DefinitionAndAbbreviation> {
            return defAndAbbList
        }

        fun delete(definition: String): DefinitionAndAbbreviation? {
            return defAndAbbList.find { it.Definition == definition }
                .also { defAndAbbList.remove(it) }
        }

        fun update(defAndAbb: DefinitionAndAbbreviation): DefinitionAndAbbreviation? {
            val existingDefAndAbb = defAndAbbList.find { it.Definition == defAndAbb.Definition }
            return existingDefAndAbb.apply {
                var definition = defAndAbb.Definition
                var abbreviation = defAndAbb.Abbreviation
            }
        }
    }
}