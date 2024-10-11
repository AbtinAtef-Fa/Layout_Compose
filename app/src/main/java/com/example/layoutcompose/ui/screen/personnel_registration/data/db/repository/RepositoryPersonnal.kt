package com.example.layoutcompose.ui.screen.personnel_registration.data.db.repository

import com.example.layoutcompose.ui.screen.personnel_registration.data.db.dao.PersonDao
import com.example.layoutcompose.ui.screen.personnel_registration.data.db.entity.PersonalModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryPersonnal @Inject constructor(private val dao: PersonDao){
    suspend fun insert(personalModel: PersonalModel){
        dao.insert(personalModel)
    }

    suspend fun getAll(): List<PersonalModel> {
        return dao.getAllPersonals()
    }
}