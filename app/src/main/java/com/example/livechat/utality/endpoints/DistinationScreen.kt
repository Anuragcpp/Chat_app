package com.example.livechat.utality.endpoints

sealed class DistinationScreen ( var route : String) {
    object SignUp : DistinationScreen("signup")
    object Login : DistinationScreen("login")
    object Profile : DistinationScreen("profile")
    object ChatList : DistinationScreen("chatlist")
    object SingleChat : DistinationScreen("singleChat/{chatId}") {
        fun createRoute (id : String)  = "singlechat/$id"
    }
    object StatusList : DistinationScreen("statusList")
    object SingleStatus : DistinationScreen("singleStatus/{userId") {
        fun createRoute ( userId : String) = "singleStatus/${userId}"
    }
}