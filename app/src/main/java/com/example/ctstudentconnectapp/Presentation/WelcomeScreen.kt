package com.example.ctstudentconnectapp.Presentation

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ctstudentconnectapp.MainActivity
import com.example.ctstudentconnectapp.Navigation.Screen
import com.example.ctstudentconnectapp.R
import com.example.ctstudentconnectapp.ui.theme.md_theme_dark_secondaryContainer
import com.example.ctstudentconnectapp.ui.theme.md_theme_dark_surfaceVariant
import com.example.ctstudentconnectapp.ui.theme.md_theme_light_onPrimaryContainer
import com.example.ctstudentconnectapp.ui.theme.md_theme_light_onSurfaceVariant
import com.example.ctstudentconnectapp.ui.theme.md_theme_light_primary
import com.example.ctstudentconnectapp.ui.theme.md_theme_light_secondary
import com.example.ctstudentconnectapp.ui.theme.md_theme_light_shadow
import com.example.ctstudentconnectapp.ui.theme.medium_quciksand
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun WelcomeScreen(navHostController: NavHostController,context:MainActivity)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = White)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        Spacer(modifier = Modifier.heightIn(50.dp))

        Image(
            painter = painterResource(R.drawable.ctlogo),
            contentDescription = "image",
            modifier = Modifier.size(300.dp)
        )

        Spacer(modifier = Modifier.heightIn(30.dp))
        Text(
            "Welcome To CT Student Connect App",
            color = md_theme_light_shadow,
            fontWeight = FontWeight.SemiBold,
            fontSize = 26.sp,
            fontFamily = medium_quciksand,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.heightIn(2.dp))
        Text(
            "Daily quizes,Particpate in Hackathones,Phychometric Test,Olympiads",
            color = md_theme_light_secondary,
            fontWeight = FontWeight.SemiBold,
            fontSize = 15.sp,
            fontFamily = medium_quciksand,
            textAlign = TextAlign.Center
        )
        //Spacer(modifier = Modifier.heightIn(15.dp))

        Spacer(modifier = Modifier.heightIn(100.dp))



        //this one is for the google button and the sign up sigin code **/


        Button(
            onClick = {

                navHostController.navigate(Screen.HomeScreen.route)

            },elevation = ButtonDefaults.buttonElevation(5.dp), border = BorderStroke(1.dp,md_theme_light_primary),
            modifier = Modifier.fillMaxWidth().padding(start=10.dp, end = 10.dp),
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(containerColor = White)
        ) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "image",
                modifier = Modifier.size(width = 28.dp, height = 28.dp)

            )
            Text(
                "Login with Google",
                color = md_theme_light_shadow,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                fontFamily = medium_quciksand,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(start = 10.dp)
            )
        }


        Spacer(modifier = Modifier.heightIn(5.dp))




        Text(
            "click to proceed >",
            color = md_theme_light_secondary,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            fontFamily = medium_quciksand,
            textAlign = TextAlign.Center,
            modifier = Modifier.clickable {
                navHostController.navigate(Screen.HomeScreen.route)
            }
        )
    }
}
