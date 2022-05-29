package com.nelly.core.util.theme

import android.content.Context
import androidx.datastore.preferences.core.edit
import com.nelly.core.constant.PreferencesKeys
import com.nelly.core.data.local.storage.dataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ThemeSettingImpl @Inject constructor(
    @ApplicationContext private val context: Context
) : ThemeSetting {

    private var themeSetting: String = runBlocking(Dispatchers.IO) {
        context.dataStore.data.map { preference ->
            preference[PreferencesKeys.USER_THEME] ?: ThemeState.SYSTEM.name
        }.first()
    }

    override val themeState: MutableStateFlow<ThemeState> = MutableStateFlow(ThemeState.valueOf(themeSetting))

    override suspend fun changeTheme(newTheme: ThemeState): Unit = withContext(Dispatchers.IO) {
        themeState.value = newTheme
        context.dataStore.edit {
            it[PreferencesKeys.USER_THEME] = newTheme.name
        }
    }

}