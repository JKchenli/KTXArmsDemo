package com.cl.dataroom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.cl.dataroom.user.User
import com.cl.dataroom.user.UserDao

/**
 * @author Chenli
 * @Date 2021/3/2
 * @Description
 */
@Database(entities = [User::class], version = 1)
abstract class AppDataBase : RoomDatabase() {

    abstract fun getUserDao(): UserDao

    companion object {
        private var instance: AppDataBase? = null

        fun getInstance(context: Context): AppDataBase {
            if (instance == null) {
                instance =
                    Room.databaseBuilder(
                        context.applicationContext,
                        AppDataBase::class.java,
                        "user.db"
                    ).allowMainThreadQueries().build()
            }
            return instance!!
        }
    }
}