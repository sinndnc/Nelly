plugins {
    id(com.nelly.android.Dependencies.Plugin.application) version "7.2.0" apply false
    id(com.nelly.android.Dependencies.Plugin.library) version "7.2.0" apply false
    id(com.nelly.android.Dependencies.Plugin.kotlin) version "1.6.21" apply false
    kotlin(com.nelly.android.Dependencies.Plugin.jvm) version "1.6.21" apply false
    kotlin(com.nelly.android.Dependencies.Plugin.serialization) version "1.6.21" apply false
}

buildscript {
    dependencies {
        classpath(com.nelly.android.Dependencies.Gradle.hilt)
        classpath(com.nelly.android.Dependencies.Gradle.android)
        classpath(com.nelly.android.Dependencies.Gradle.googleService)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}