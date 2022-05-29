package com.nelly.feature.navigation.enum

sealed class Content(val route : String){

    object Splash : Content("splash")
    object OnBoard : Content("onBoard")
    object Login : Content("login")
    object Register : Content("register")
    object Home : Content("home")
    object NotFound : Content("not_found")

    companion object{
        const val AUTH_GRAPH = "auth_graph"
        const val MAIN_GRAPH = "home_graph"
    }
}

