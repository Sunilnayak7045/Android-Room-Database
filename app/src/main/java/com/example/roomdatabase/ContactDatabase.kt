package com.example.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ContactDataClass::class], version = 1)

//inside the Database we have to pass array that contain number of tables present &
// tables are declared through Entity , here we have only 1 Entity i.e ContactDataClass
// now Entities are linked to database


abstract class ContactDatabase : RoomDatabase() {

    // To linked DAO to database we use abstract fun
    abstract fun contact_db_fun(): ContactDAO


}