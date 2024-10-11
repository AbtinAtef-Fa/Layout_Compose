package com.example.layoutcompose.ui.screen.personnel_registration.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "table_person")
data class PersonalModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val firstName: String,
    val lastName: String,
    val phone: String,
    val email: String,
    val address: String,
    val nationalCode: String
)

