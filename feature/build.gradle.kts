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
    buildFeatures {
        compose =  true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Compose.compose_version
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
    //MODULE
    implementation(project(Dependencies.Module.core))

    //DEFAULT
    implementation(Dependencies.Androidx.core)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Navigation.hilt)

    //LIFECYCLE
    implementation(Dependencies.Lifecycle.runtime)

    //ACCOMPANIST
    implementation(Dependencies.Accompanist.systemUiController)

    //HILT
    implementation(Dependencies.Hilt.hilt)
    kapt(Dependencies.Hilt.hiltKapt)

    //TEST
    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.AndroidTest.junit)
    androidTestImplementation(Dependencies.AndroidTest.uiJunit)
    androidTestImplementation(Dependencies.AndroidTest.espresso)
    debugImplementation(Dependencies.DebugTest.uiTooling)
}