package com.example.tedo.MVVM.Repository

import android.text.format.DateFormat
import com.example.tedo.MVVM.Model.Revision
import com.example.tedo.MVVM.Model.TestDocument

class TestDocumentRepository {
    var testDocumentList = mutableListOf<TestDocument>()

    fun create(
        name : String,
        documentSupplied : String,

    ) : TestDocument
    {
        val testDocument = TestDocument(
            Name = name,
            DocumentSupplied = documentSupplied
        )
        testDocumentList.add(testDocument)
        return testDocument
    }

    fun getByName(name : String) : TestDocument?{
        return testDocumentList.find { it.Name == name}
    }

    fun getAll() : MutableList<TestDocument>{
        return testDocumentList
    }

    fun delete(testDocument : TestDocument) : TestDocument? {
        /*return firms.firstOrNull {it.Name == name}?.also { firms.remove(it) }*/
        return testDocumentList.find{it.Name == testDocument.Name}.also{testDocumentList.remove(it)}
    }

    fun update(testDocument : TestDocument) : TestDocument?{
        val existingRevision = testDocumentList.find { it.Name == testDocument.Name }
        return existingRevision.apply {
            var name = testDocument.Name
            var documentSupplied = testDocument.DocumentSupplied
        }
    }
}