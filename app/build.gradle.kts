import com.nelly.android.Dependencies

plugins {
    id(com.nelly.android.Dependencies.Plugin.application)
    id(com.nelly.android.Dependencies.Plugin.kotlin)
    id(com.nelly.android.Dependencies.Plugin.hilt)
    id(com.nelly.android.Dependencies.Plugin.kapt)
}

android {
    compileSdk = Dependencies.Config.targetSdk

    defaultConfig {
        applicationId = Dependencies.Config.applicationId
        minSdk = Dependencies.Config.minSdk
        targetSdk = Dependencies.Config.targetSdk
        versionCode = Dependencies.Config.versionCode
        versionName = Dependencies.Config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11

    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Compose.compose_version
    }
    packagingOptions {
        resources.excludes.add("META-INF/*")
    }
}

kapt {
    correctErrorTypes = true
}

dependencies {
    implementation(project(Dependencies.Module.core))

    implementation(project(Dependencies.Module.feature))
    implementation(Dependencies.Androidx.core)
    implementation(Dependencies.Compose.activity)

    //HILT
    implementation(Dependencies.Hilt.hilt)
    kapt(Dependencies.Hilt.hiltKapt)

    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.AndroidTest.junit)
    androidTestImplementation(Dependencies.AndroidTest.uiJunit)
    androidTestImplementation(Dependencies.AndroidTest.espresso)
    debugImplementation(Dependencies.DebugTest.uiTooling)
    debugImplementation(Dependencies.DebugTest.uiManifest)
}