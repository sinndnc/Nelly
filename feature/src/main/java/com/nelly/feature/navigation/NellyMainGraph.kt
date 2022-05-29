package com.nelly.feature.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.nelly.feature.navigation.enum.Content
import com.nelly.feature.presentation.splash.SplashContent
import com.nelly.feature.presentation.splash.SplashViewModel

fun NavGraphBuilder.nellyMainGraph() {
    navigation(
        route = Content.MAIN_GRAPH,
        startDestination = Content.Splash.route
    ) {
        composable(Content.Splash.route) {
            val splashViewModel = hiltViewModel<SplashViewModel>()
            SplashContent(viewModel = splashViewModel)
        }
        composable(Content.Home.route) {

        }
    }
}