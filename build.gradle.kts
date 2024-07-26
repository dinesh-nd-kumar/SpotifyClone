buildscript {
    val kotlin_version = "1.4.0"

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(libs.google.services)
//        classpath ("com.android.tools.build:gradle:4.0.2")
//        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
//        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.28.3-alpha")
//        classpath ("com.google.gms:google-services:4.4.2")

        classpath ("com.android.tools.build:gradle:8.1.1")
        classpath (libs.kotlin.gradle.plugin) // Updated version
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.42") // Updated version
        classpath ("com.google.gms:google-services:4.3.15") // Updated versio
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    alias(libs.plugins.daggerHilt) apply false
}