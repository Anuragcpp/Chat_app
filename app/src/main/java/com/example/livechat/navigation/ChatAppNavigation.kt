package com.example.livechat.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.livechat.Screens.LoginScreen
import com.example.livechat.Screens.ProfileScreen
import com.example.livechat.Screens.SignUpScreen
import com.example.livechat.utality.endpoints.DistinationScreen

@Composable
fun ChatAppNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = DistinationScreen.SignUp.route) {
        composable(DistinationScreen.SignUp.route) {
            SignUpScreen()
        }

        composable(DistinationScreen.Login.route) {
            LoginScreen()
        }

        composable(DistinationScreen.Profile.route) {
            ProfileScreen()
        }




    }
}