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
