package com.example.tedo.MVVM.Repository

import android.graphics.pdf.PdfDocument.Page
import android.text.format.DateFormat
import com.example.tedo.MVVM.Model.Firm
import com.example.tedo.MVVM.Model.Participant
import com.example.tedo.MVVM.Model.Revision
import com.example.tedo.MVVM.Model.TestDocument

class RevisionRepository {
    var revisionList = mutableListOf<Revision>()

    fun create(
        number: Int,
        pageaffected: String,
        chapterAffected: String,
        description: String,
        date: DateFormat
    ) : Revision
    {
        val revision = Revision(
            Number = number,
            PageAffected = pageaffected,
            ChapterAffected = chapterAffected,
            Description = description,
            Date = date
        )
        revisionList.add(revision)
        return revision
    }

    fun getByName(number : Int) : Revision?{
        return revisionList.find { it.Number == number}
    }

    fun getAll() : MutableList<Revision>{
        return revisionList
    }

    fun delete(revision : Revision) : Revision? {
        /*return firms.firstOrNull {it.Name == name}?.also { firms.remove(it) }*/
        return revisionList.find{it.Number == revision.Number}.also{revisionList.remove(it)}
    }

    fun update(revision : Revision) : Revision?{
        val existingRevision = revisionList.find { it.Number == revision.Number }
        return existingRevision.apply {
            var number = revision.Number
            var pageaffected = revision.PageAffected
            var chapterAffected = revision.ChapterAffected
            var description = revision.Description
        }
    }
}