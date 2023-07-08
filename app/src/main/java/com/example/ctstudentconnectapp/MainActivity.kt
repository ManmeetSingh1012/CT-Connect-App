package com.example.ctstudentconnectapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.example.ctstudentconnectapp.Navigation.NavGraph
import com.example.ctstudentconnectapp.ui.theme.CTStudentConnectAppTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
       val  splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContent {
            CTStudentConnectAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    //color = MaterialTheme.colorScheme.background
                ) {
                    //()

                    val navController = rememberNavController( )
                    NavGraph(navcontroller = navController,this@MainActivity)



                    
                }
            }
        }
    }
}



