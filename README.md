# Android-Room-Database-with-Singleton-And-Typeconverter


1.Singleton class is a class that is defined in such a way that only one instance of the class can be created and used everywhere. 
Many times we create the two different objects of the same class, 
but we have to remember that creating two different objects also requires the allocation of two different memories for the objects. 
So it is better to make a single object and use it again and again.

2.possibility that 2 threads are trying to access at same time, so multiple database instance will be created
so we use locking mechanism i.e synchronized block

3.@volatile annotation : any value assigned to Instance var i.e (private var Instance_var ),
 then it will notify to every threads, now every thread will get the updated value. 
 
4.Type convertors:
SQLite only supports:
1.null
2.integer
3.real
4.text
5.blob (BLOB stands for Binary Large Object. It is defined as the chunk of binary data being stored as a single entity in a database system. 
BLOBs are used primarily to hold multimedia objects like images, videos, and sound, though they can also be used to store programs)

e.g we want to store the date obj so we have to use Type convertor
