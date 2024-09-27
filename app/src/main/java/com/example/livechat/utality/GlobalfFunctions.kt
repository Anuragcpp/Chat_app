package com.example.livechat.utality

import androidx.navigation.NavController

fun navigateTo( navController: NavController,route : String) {
    navController.navigate(route) {
        popUpTo(route)
        launchSingleTop = true
    }
}

fun checkEmptyFields(
    name : String,
    email : String,
    number : String,
    password : String
) : Boolean {
    return !(name.isBlank() || email.isBlank() || number.isBlank() || password.isBlank())
}