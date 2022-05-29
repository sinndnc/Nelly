package com.nelly.core.util.theme

import kotlinx.coroutines.flow.MutableStateFlow


interface ThemeSetting {

    val themeState: MutableStateFlow<ThemeState>

    suspend fun changeTheme(newTheme: ThemeState)
}