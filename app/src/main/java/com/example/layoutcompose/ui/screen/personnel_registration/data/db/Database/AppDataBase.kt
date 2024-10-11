package com.example.layoutcompose.ui.screen.personnel_registration.data.db.Database


import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context
import com.example.layoutcompose.ui.screen.personnel_registration.data.db.dao.PersonDao
import com.example.layoutcompose.ui.screen.personnel_registration.data.db.entity.PersonalModel

@Database(entities = [PersonalModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun personalDao(): PersonDao

}