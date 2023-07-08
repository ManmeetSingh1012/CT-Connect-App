package com.example.ctstudentconnectapp.Navigation

sealed class Screen(val route:String) {

    object WelcomeScreen:Screen("WelcomeScreen")
    object HomeScreen:Screen("HomeScreen")
}