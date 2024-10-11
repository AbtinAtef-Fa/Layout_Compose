package com.example.layoutcompose.ui.screen.personnel_registration.data.di

import android.content.Context
import androidx.room.Room
import com.example.layoutcompose.ui.screen.personnel_registration.data.db.Database.AppDatabase
import com.example.layoutcompose.ui.screen.personnel_registration.data.db.dao.PersonDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent ::class)
object DataBaseDaggerHilt {
    @Provides
    @Singleton
    fun providerDatabase(@ApplicationContext context: Context) :AppDatabase{
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "app_personal"
        ).build()
    }

    @Provides
    @Singleton
    fun providePersonalDao(database: AppDatabase) : PersonDao{
        return database.personalDao()
    }
}