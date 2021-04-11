package com.cl.dataroom.user

import androidx.room.*

/**
 * @author Chenli
 * @Date 2021/3/2
 * @Description
 */
@Dao
interface UserDao {

    @Insert()
    fun insertUser(user: User)

    @Delete
    fun deleteUser(user: User)

    @Update
    fun updateUser(user: User)

    @Query("select * from users where userId= :userId")
    fun getUserById(userId: Long): User
}