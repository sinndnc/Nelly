package com.nelly.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.collectAsState
import androidx.core.view.WindowCompat
import com.nelly.core.util.theme.ThemeSetting
import com.nelly.feature.component.theme.NellyTheme
import com.nelly.feature.navigation.NellyNavigationGraph
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class NellyActivity : ComponentActivity() {

    @Inject
    lateinit var themeSetting: ThemeSetting

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialSettingsAndContent()
    }

    private fun initialSettingsAndContent() {
        initialSettings()
        setContent {
            val theme = themeSetting.themeState.collectAsState()
            NellyTheme(theme.value) {
                NellyNavigationGraph()
            }
        }
    }

    private fun initialSettings() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }
}
