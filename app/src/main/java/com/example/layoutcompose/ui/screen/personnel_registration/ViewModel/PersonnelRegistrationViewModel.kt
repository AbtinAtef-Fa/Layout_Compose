package com.example.layoutcompose.ui.screen.personnel_registration.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.layoutcompose.ui.screen.personnel_registration.data.db.dao.PersonDao
import com.example.layoutcompose.ui.screen.personnel_registration.data.db.entity.PersonalModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PersonnelRegistrationViewModel @Inject constructor(
    private val personDao: PersonDao
): ViewModel() {

    private val _ListPersonal = MutableLiveData<List<PersonalModel>>()
    val person : LiveData<List<PersonalModel>> get() = _ListPersonal


    init {
        fetchPerson()
    }

    fun fetchPerson(){
        viewModelScope.launch {
            _ListPersonal.value = personDao.getAllPersonals()
        }
    }

    fun addPerson(personalModel: PersonalModel){
        viewModelScope.launch {
            personDao.insert(personalModel)
            fetchPerson()
        }
    }
}