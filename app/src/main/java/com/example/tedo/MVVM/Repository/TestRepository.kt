package com.example.tedo.MVVM.Repository

import android.text.format.DateFormat
import com.example.tedo.MVVM.Model.Revision
import com.example.tedo.MVVM.Model.Test
import com.example.tedo.MVVM.Model.TestDocument

class TestRepository {
    var testList = mutableListOf<Test>()
    fun create(
        title: String,
        testProcedure: String,
        description: String,
        IATInitials: String,
        FATInitials: String,
        SATInitials: String,
        OATInitials: String
    ) : Test
    {
        val test = Test(
            Title = title,
            TestProcedure = testProcedure,
            Description = description,
            IATInitials = IATInitials,
            FATInitials = FATInitials,
            SATInitials = SATInitials,
            OATInitials = OATInitials
        )
        testList.add(test)
        return test
    }

    fun getByName(title : String) : Test?{
        return testList.find { it.Title == title}
    }

    fun getAll() : MutableList<Test>{
        return testList
    }

    fun delete(test : Test) : Test? {
        /*return firms.firstOrNull {it.Name == name}?.also { firms.remove(it) }*/
        return testList.find{it.Title == test.Title}.also{testList.remove(it)}
    }

    fun update(test : Test) : Test?{
        val existingTest = testList.find { it.Title == test.Title }
        return existingTest.apply {
            var title = test.Title
            var testProcedure = test.TestProcedure
            var description = test.Description
            var iatInitials = test.IATInitials
            var satInitials = test.SATInitials
            var oatInitials = test.OATInitials
            var fatInitials = test.FATInitials
        }
    }
}