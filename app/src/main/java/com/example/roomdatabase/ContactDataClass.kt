package com.example.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "contactTableName")
data class ContactDataClass(

    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val phone: String

)
