package com.nelly.feature.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.nelly.feature.navigation.enum.Content
import com.nelly.feature.presentation.auth.login.LoginContent
import com.nelly.feature.presentation.auth.login.LoginViewModel
import com.nelly.feature.presentation.auth.onboard.OnBoardContent
import com.nelly.feature.presentation.auth.onboard.OnBoardViewModel
import com.nelly.feature.presentation.splash.SplashContent
import com.nelly.feature.presentation.splash.SplashViewModel


fun NavGraphBuilder.nellyAuthGraph() {
    navigation(
        startDestination = Content.OnBoard.route,
        route = Content.AUTH_GRAPH
    ) {
        composable(Content.Splash.route){
            val splashViewModel = hiltViewModel<SplashViewModel>()
            SplashContent(viewModel = splashViewModel)
        }
        composable(Content.OnBoard.route) {
            val onBoardViewModel = hiltViewModel<OnBoardViewModel>()
            OnBoardContent(viewModel = onBoardViewModel)
        }
        composable(Content.Login.route) {
            val loginViewModel = hiltViewModel<LoginViewModel>()
            LoginContent(viewModel = loginViewModel)
        }
    }
}