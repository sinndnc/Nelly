package com.nelly.core.constant

import androidx.datastore.preferences.core.stringPreferencesKey

object PreferencesKeys {
    //USERS
    val USER_NAME = stringPreferencesKey("user_name")
    val USER_PASSWORD = stringPreferencesKey("user_password")
    val USER_TOKEN = stringPreferencesKey("user_token")
    val USER_ID = stringPreferencesKey("user_id")
    val USER_EMAIL = stringPreferencesKey("user_email")
    val USER_PHONE = stringPreferencesKey("user_phone")
    val USER_THEME = stringPreferencesKey("user_theme")
}