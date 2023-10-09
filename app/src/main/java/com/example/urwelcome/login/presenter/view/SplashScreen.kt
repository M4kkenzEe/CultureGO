package com.example.urwelcome.login.presenter.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.urwelcome.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onTimedOut: () -> Unit = {}) {
    LaunchedEffect(true) {
        delay(2000)
        onTimedOut()
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg0),
            contentDescription = "",
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_matreshka),
                contentDescription = null
            )
            Text(
                text = "CultureGO",
                fontSize = 32.sp,
                fontWeight = FontWeight(700),
                color = Color.White
            )
        }
    }
}


@Preview
@Composable
fun SplashScreenPrev() {
    SplashScreen()
}