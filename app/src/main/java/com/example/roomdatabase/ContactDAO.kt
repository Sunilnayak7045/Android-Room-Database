package com.example.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface ContactDAO {

    //insert method
    @Insert
    suspend fun insertContact(contactDC_var: ContactDataClass)

    @Update
    suspend fun updateContact(contactDC_var: ContactDataClass)

    @Delete
    suspend fun deleteContact(contactDC_var: ContactDataClass)

    @Query("SELECT * FROM contactTableName")
     fun getContact() : LiveData<List<ContactDataClass>>
    // suspend is not required because whenever there is livedata roomdb executes on bg thread
     // roomdb is compatible with LiveData
}