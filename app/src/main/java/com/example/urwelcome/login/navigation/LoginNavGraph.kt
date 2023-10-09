package com.example.urwelcome.login.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.urwelcome.login.presenter.view.LoginPreviewScreen
import com.example.urwelcome.login.presenter.view.LoginScreen
import com.example.urwelcome.login.presenter.view.SplashScreen

@Composable
fun LoginNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = LoginScreens.Splash.route
    ) {
        composable(LoginScreens.Splash.route) {
            SplashScreen(onTimedOut = { navController.navigate(LoginScreens.LoginPreview.route) })
        }
        composable(LoginScreens.LoginPreview.route) {
            LoginPreviewScreen(
                signInClick = { navController.navigate(LoginScreens.Login.route) },
                registrationClick = {}
            )
        }

        composable(LoginScreens.Login.route) {
            LoginScreen(
                loginClick = { navController.navigate(LoginScreens.Splash.route) },
                forgotPasswordClick = {}
            )
        }
    }
}