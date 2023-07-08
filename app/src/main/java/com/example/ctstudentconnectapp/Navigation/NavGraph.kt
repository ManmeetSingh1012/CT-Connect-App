package com.example.ctstudentconnectapp.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ctstudentconnectapp.MainActivity
import com.example.ctstudentconnectapp.Presentation.HomeScreen
import com.example.ctstudentconnectapp.Presentation.WelcomeScreen

@Composable
fun NavGraph(navcontroller: NavHostController, mainActivity: MainActivity)
{
    NavHost(navController = navcontroller, startDestination = Screen.WelcomeScreen.route)
    {
        composable(Screen.WelcomeScreen.route)
        {
            WelcomeScreen(navHostController = navcontroller,mainActivity)
        }

        composable(Screen.HomeScreen.route)
        {
            HomeScreen(navcontroller,mainActivity)
        }
    }
}