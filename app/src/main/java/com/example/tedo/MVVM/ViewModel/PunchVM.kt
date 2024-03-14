package com.example.tedo.MVVM.ViewModel

import com.example.tedo.MVVM.Model.Punch
import com.example.tedo.MVVM.Model.Test

/*data class PunchVM(
    var Test: TestVM? = null,
    var PunchNumber: Int,
    var Description: String,
    var Owner: String,
    var Action: String
)*/
class PunchVM(punch: Punch){
    val test : Test? = punch.Test
    val punchNumber : Int? = punch.PunchNumber
    val descriptiom : String? = punch.Description
    val owner: String? = punch.Owner
    val action: String? = punch.Action
}