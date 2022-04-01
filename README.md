# Android-Room-Database

android {

    .
    .
    
    buildFeatures {
        dataBinding true
    }
}
    
plugins 
{

    id 'kotlin-kapt'
    
}
    
-----------------------------------------------------------

    //roomdb dependencies
    def roomVersion = "2.4.2"

    implementation("androidx.room:room-runtime:$roomVersion")
    kapt("androidx.room:room-compiler:$roomVersion")
    implementation("androidx.room:room-ktx:$roomVersion")
    
    
    //coroutines-core library from official github
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")
    
-----------------------------------------------------------

**_Room-Database-Description._**

1.In the case of SQLite, There is no compile-time verification of raw SQLite queries.

2.The room provides the compile-time query verification, which will reduce the error and provide a smooth connection between the database and the java objects.

3.Room is built to work with LiveData & data observation, while SQLite does not.

4.Room has three main components of Room DB :
Entity
Dao
Database

5.The main components are:

Entity - An entity is a class that is annotated with the @Entity annotation. This class represents a database table.
DAO - A Data Access Object is used to map SQL queries to functions. It’s an interface annotated with the @DAO annotation.
by the name itself we can conclude Access to data, through interface containing methods to access db - CRUD operation (create read update delete)

6.The DAO interface has three major annotations used to query the database.

@Insert - This is used to insert data into a table. The item passed in the function that’s annotated with this function is added to the database.
@Query - This is used when one wants to write an SQL statement. It receives an SQL statement as its parameter.
@Update-This is used to update the data.
@Delete - This annotation is used to delete the contents of a database.

7.In sqlite to fetch the data, we use cursor objects in which we retrieve data using loop which is tedious.





    
