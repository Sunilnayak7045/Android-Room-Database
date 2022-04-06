package com.example.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity(tableName = "contactTableName")
data class ContactDataClass(

    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val phone: String,
    val createdDate : Date,
    val isActive: Int //can't use boolean because we can't store boolean in sqlite

)
