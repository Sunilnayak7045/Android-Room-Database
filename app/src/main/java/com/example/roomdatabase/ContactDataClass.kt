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
    val createdDate : Date

)
