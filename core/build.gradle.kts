import com.nelly.android.Dependencies;

plugins {
    id(com.nelly.android.Dependencies.Plugin.library)
    id(com.nelly.android.Dependencies.Plugin.kotlin)
    id(com.nelly.android.Dependencies.Plugin.hilt)
    id(com.nelly.android.Dependencies.Plugin.kapt)
}

android {
    compileSdk = Dependencies.Config.targetSdk

    defaultConfig {
        minSdk = Dependencies.Config.minSdk
        targetSdk = Dependencies.Config.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
}
kapt {
    correctErrorTypes = true
}

dependencies {
    //FIREBASE
    implementation(platform(Dependencies.Firebase.boom))
    implementation(Dependencies.Firebase.firestore)
    implementation(Dependencies.Firebase.auth)

    //SERIALIZATION
    implementation(Dependencies.Serialization.runtime)

    //LIFECYCLE
    implementation(Dependencies.Lifecycle.service)

    //HILT
    implementation(Dependencies.Hilt.hilt)
    kapt(Dependencies.Hilt.hiltKapt)

    //CORE
    implementation(Dependencies.Androidx.core)
    implementation(Dependencies.Coroutines.services)
    implementation(Dependencies.Lifecycle.runtime)

    //PREFERENCES
    implementation(Dependencies.Preferences.datastore)


}