package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var database: ContactDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // It will return a db object
        database= Room.databaseBuilder(
            applicationContext,
            ContactDatabase::class.java,
            "contactName"
        ).build()
        // contactName is the name of db

        GlobalScope.launch {

            // instance of db
            database.contact_db_fun().insertContact(ContactDataClass(0,"Sunil","8454890942"))
        }
    }

    //whenever we click on textview fun getData() is called
    fun getData(view: View) {
        database.contact_db_fun().getContact().observe(this, Observer {
            //whenever there is entry in db, following code will get execute
            // or whenever there is update in data this code will get execute

            Toast.makeText(applicationContext, "${it.toString()}", Toast.LENGTH_LONG).show()
        })
    }
}