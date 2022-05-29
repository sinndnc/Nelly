package com.nelly.feature.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.nelly.feature.navigation.enum.Content

@Composable
fun NellyNavigationGraph() {

    val navController = rememberNavController()
    val isUser = true

    NavHost(
        modifier = Modifier.fillMaxSize().background(MaterialTheme.colors.background),
        navController = navController,
        startDestination = if (isUser) Content.MAIN_GRAPH else Content.AUTH_GRAPH,
    ) {
        nellyAuthGraph()
        nellyMainGraph()
    }
}