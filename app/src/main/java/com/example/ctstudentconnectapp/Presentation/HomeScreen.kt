package com.example.ctstudentconnectapp.Presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.ctstudentconnectapp.MainActivity

@Composable
fun HomeScreen(navHostController: NavHostController,mainActivity: MainActivity)
{
    Column(modifier = Modifier.fillMaxSize())
    {
        Text(text = "Home Screen")
    }
}