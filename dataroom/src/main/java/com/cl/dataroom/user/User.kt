package com.cl.dataroom.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author Chenli
 * @Date 2021/3/2
 * @Description
 */
@Entity(tableName = "users")
data class User(
    @PrimaryKey var userId: Long,
    @ColumnInfo(name = "user_name") var userName: String
)
