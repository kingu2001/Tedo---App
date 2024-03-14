package com.example.tedo.MVVM.ViewModel

import com.example.tedo.MVVM.Model.Test
import com.example.tedo.MVVM.Model.TestDocument

class TestVM(test : Test){
    val title: String? = test.Title
    val testDocument: TestDocument? = test.TestDocument
    val testProcedure: String? = test.TestProcedure
    val description: String? = test.Description
    val iatInitials: String? = test.IATInitials
    val fatInitials: String? = test.FATInitials
    val satInitials: String? = test.SATInitials
    val oatInitials: String? = test.OATInitials
}
