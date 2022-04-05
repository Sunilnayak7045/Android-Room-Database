package com.example.roomdatabase

import android.content.Context
import androidx.databinding.adapters.Converters
import androidx.room.*


@Database(entities = [ContactDataClass::class], version = 1)
//inside the Database we have to pass array that contain number of tables present &
// tables are declared through Entity , here we have only 1 Entity i.e ContactDataClass
// now Entities are linked to database




@TypeConverters(Convertors::class)
abstract class ContactDatabase : RoomDatabase() {

    // To linked DAO to database we use abstract fun
    abstract fun contact_db_fun(): ContactDAO


    //sington
    companion object {
        @Volatile
        private var Instance_var: ContactDatabase? = null
        //private field to hold the db Instance


        // now we need public method to expose/access the db, so we use fun getDatabase
        fun getDatabase(context: Context): ContactDatabase {
            if (Instance_var == null) {          //if null return the obj

//                Instance_var= Room.databaseBuilder(context.applicationContext, ContactDatabase::class.java,
//                    "contactName"
//                ).build()

                synchronized(this) {
                    Instance_var= Room.databaseBuilder(context.applicationContext, ContactDatabase::class.java,
                        "contactName"
                    ).build()
                }


            }
            return Instance_var!!


        }


    }
}