package com.example.livechat.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.livechat.Screens.LoginScreen
import com.example.livechat.Screens.ProfileScreen
import com.example.livechat.Screens.SignUpScreen
import com.example.livechat.utality.endpoints.DistinationScreen
import com.example.livechat.viewModel.LiveChatViewModel

@Composable
fun ChatAppNavigation() {

    val navController = rememberNavController()
    val viewModel = hiltViewModel<LiveChatViewModel>()

    NavHost(navController = navController, startDestination = DistinationScreen.SignUp.route) {
        composable(DistinationScreen.SignUp.route) {
            SignUpScreen(viewModel,navController)
        }

        composable(DistinationScreen.Login.route) {
            LoginScreen()
        }

        composable(DistinationScreen.Profile.route) {
            ProfileScreen()
        }




    }
}