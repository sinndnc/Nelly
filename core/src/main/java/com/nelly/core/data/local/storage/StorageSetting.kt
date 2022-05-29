package com.nelly.core.data.local.storage

import androidx.datastore.preferences.core.Preferences
import kotlinx.coroutines.flow.Flow


//TODO if I wanna add to any type of save data on local storage add it in here
abstract class StorageSetting {
    abstract val dataStore: Flow<Preferences>

    //String
    abstract suspend fun writeStringData(key: Preferences.Key<String>, data: String)
    abstract fun readStringData(key: Preferences.Key<String>): Flow<String>

    //Int
    abstract suspend fun writeIntData(key: Preferences.Key<Int>, data: Int)
    abstract fun readIntData(key: Preferences.Key<Int>): Flow<Int?>

    //Boolean
    abstract suspend fun writeBooleanData(key: Preferences.Key<Boolean>, data: Boolean)
    abstract fun readBooleanData(key: Preferences.Key<Boolean>): Flow<Boolean?>


}