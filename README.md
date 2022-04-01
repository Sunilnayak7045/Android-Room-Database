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
