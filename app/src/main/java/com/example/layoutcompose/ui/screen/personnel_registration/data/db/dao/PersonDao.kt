package com.example.layoutcompose.ui.screen.personnel_registration.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.layoutcompose.ui.screen.personnel_registration.data.db.entity.PersonalModel
import kotlinx.coroutines.flow.Flow

@Dao
interface PersonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(personal: PersonalModel)

    @Query("SELECT * FROM table_person")
    suspend fun getAllPersonals(): List<PersonalModel>
}