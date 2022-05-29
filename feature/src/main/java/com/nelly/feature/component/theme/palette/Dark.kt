package com.nelly.feature.component.theme.palette

import androidx.compose.material.darkColors
import androidx.compose.ui.graphics.Color
import com.nelly.feature.component.theme.Blue300
import com.nelly.feature.component.theme.Blue700
import com.nelly.feature.component.theme.Pink300
import com.nelly.feature.component.theme.Pink500

val DarkColorPalette = darkColors(
    primary = Pink300,
    onPrimary = Color.White,

    secondary = Blue300,
    onSecondary = Color.Black,

    primaryVariant = Pink500,
    secondaryVariant = Blue700,

    background = Color.Black,
    onBackground = Color.White,

    surface = Color.Black,
    onSurface = Color.White,

    error = Color.Red,
    onError = Color.White
)