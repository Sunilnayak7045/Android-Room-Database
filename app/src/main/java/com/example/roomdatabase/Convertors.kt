package com.example.roomdatabase

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import java.util.*


class Convertors {

    //WE will get the date obj & we will convert that into long
    //we are converting into long because we can't store date directly into db

    @TypeConverter
    fun fromDateToLong(value : Date) : Long {
        return value.time
    }

    // reverse  fun : convert long to date

    @TypeConverter
    fun fromLongToDate(value : Long) : Date {
        return Date(value)
    }


}