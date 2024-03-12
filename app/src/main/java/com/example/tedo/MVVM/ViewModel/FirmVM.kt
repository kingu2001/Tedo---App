package com.example.tedo.MVVM.ViewModel
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tedo.MVVM.Model.Firm
import com.example.tedo.MVVM.Repository.FirmRepository

class FirmVM(private val firmRepository : FirmRepository) : ViewModel(){
    /**MutableLiveData -> Ensures that the data is up-to-date, but there is no persistency.**/
    private val _firm = MutableLiveData<Firm>()

    //Properties
    val firm : LiveData<Firm> get() = _firm

    fun loadFirms(){
        firmRepository.getAll()
    }

    fun loadFirm(firmName : String){
        val firm = firmRepository.getByName(firmName)
        _firm.value = firm
    }

    /// TODO:
    fun updateFirm(newName:String, newFullAddress:String, newSAT:Boolean, newIAT:Boolean, newFAT:Boolean, newOAT:Boolean){
    }

data class FirmVM(
    var Name : String? = null,
    var FullAddress : String? = null,
    var SAT : Boolean? = null,
    var IAT : Boolean? = null,
    var OAT : Boolean? = null,
    var FAT : Boolean? = null,
    var Participants : MutableList<ParticipantVM> = mutableListOf()
)

