package com.nelly.feature.presentation.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.nelly.core.util.theme.ThemeState

@Composable
fun SplashContent(viewModel: SplashViewModel) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { viewModel.changeTheme(ThemeState.DARK) }) {
            Text(text = "Change Theme to Dark")
        }
        Button(onClick = { viewModel.changeTheme(ThemeState.LIGHT) }) {
            Text(text = "Change Theme to Light")
        }
    }
}