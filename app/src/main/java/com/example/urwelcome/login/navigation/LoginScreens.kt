package com.example.urwelcome.login.navigation

sealed class LoginScreens(val route: String) {

    object Splash : LoginScreens(route = "splash")
    object LoginPreview : LoginScreens(route = "login_preview")
    object Login : LoginScreens(route = "login")
}