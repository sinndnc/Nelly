package com.nelly.feature.component.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.nelly.feature.component.theme.palette.DarkColorPalette
import com.nelly.feature.component.theme.palette.LightColorPalette
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.nelly.core.util.theme.ThemeState

@Composable
fun NellyTheme(theme: ThemeState, content: @Composable () -> Unit) {
    val isDarkTheme: Boolean = when (theme) {
        ThemeState.DARK -> true
        ThemeState.LIGHT -> false
        ThemeState.SYSTEM -> isSystemInDarkTheme()
    }

    val systemUiController = rememberSystemUiController()
    val colors = if (isDarkTheme) DarkColorPalette else LightColorPalette

    SideEffect {
        systemUiController.setSystemBarsColor(
            color = Color.Transparent,
            darkIcons = !isDarkTheme,
            isNavigationBarContrastEnforced = false,
        )
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}