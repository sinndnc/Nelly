package com.nelly.feature.presentation.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nelly.core.util.theme.ThemeSetting
import com.nelly.core.util.theme.ThemeState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val themeSetting: ThemeSetting,
): ViewModel() {

    fun changeTheme(theme : ThemeState) {
        viewModelScope.launch {
            themeSetting.changeTheme(theme)
        }
    }
}