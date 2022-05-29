package com.nelly.android

import com.nelly.android.Dependencies.Compose.compose_version


/**
 * For all packages you can click this link to see the source code:
 * @see [https://developer.android.com/reference/packages]
 */
object Dependencies {
    private const val hilt_version = "2.38.1"

    object Plugin {
        const val jvm = "jvm"
        const val kapt = "kotlin-kapt"
        const val library = "com.android.library"
        const val hilt = "dagger.hilt.android.plugin"
        const val application = "com.android.application"
        const val kotlin = "org.jetbrains.kotlin.android"
        const val serialization = "plugin.serialization"

    }

    object Gradle {
        const val android = "com.android.tools.build:gradle:7.2.0"
        const val googleService = "com.google.gms:google-services:4.3.10"
        const val hilt = "com.google.dagger:hilt-android-gradle-plugin:$hilt_version"
    }

    object Androidx {
        const val core = "androidx.core:core-ktx:1.7.0"
    }

    object Firebase {
        private const val version = "30.0.0"
        const val boom = "com.google.firebase:firebase-bom:$version"
        const val analytics = "com.google.firebase:firebase-analytics-ktx"
        const val firestore = "com.google.firebase:firebase-firestore-ktx"
        const val auth = "com.google.firebase:firebase-auth-ktx"
    }

    object Hilt {
        const val hilt = "com.google.dagger:hilt-android:$hilt_version"
        const val hiltKapt = "com.google.dagger:hilt-android-compiler:$hilt_version"
    }

    object Coroutines {
        private const val version = "1.3.6"
        const val services = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:$version"
    }

    object Preferences {
        private const val version = "1.0.0"
        const val datastore = "androidx.datastore:datastore-preferences:$version"
    }

    object Serialization {
        private const val version = "1.3.3"
        const val runtime = "org.jetbrains.kotlinx:kotlinx-serialization-json:$version"
    }

    object Compose {
        const val compose_version = "1.2.0-beta02"
        const val ui = "androidx.compose.ui:ui:$compose_version"
        const val activity = "androidx.activity:activity-compose:1.4.0"
        const val material = "androidx.compose.material:material:$compose_version"
    }

    object Lifecycle {
        private const val version = "2.4.1"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
        const val service = "androidx.lifecycle:lifecycle-service:$version"
    }

    object Navigation {
        private const val version = "1.0.0"
        const val hilt = "androidx.hilt:hilt-navigation-compose:$version"

    }

    object Test {
        const val junit = "junit:junit:4.13.2"
    }

    object AndroidTest {
        const val junit = "androidx.test.ext:junit:1.1.3"
        const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
        const val uiJunit = "androidx.compose.ui:ui-test-junit4:$compose_version"
    }

    object DebugTest {
        const val uiTooling = "androidx.compose.ui:ui-tooling:$compose_version"
        const val uiManifest = "androidx.compose.ui:ui-test-manifest:$compose_version"
    }

    object Accompanist {
        private const val version = "0.23.1"
        const val systemUiController = "com.google.accompanist:accompanist-systemuicontroller:$version"
    }

    object Config {
        const val applicationName = "Nelly"
        const val applicationId = "com.nelly.android"
        const val targetSdk = 32
        const val minSdk = 28
        const val versionCode = 1
        const val versionName = "1.0"
    }

    object Module {
        const val app = ":app"
        const val core = ":core"
        const val feature = ":feature"
    }
}