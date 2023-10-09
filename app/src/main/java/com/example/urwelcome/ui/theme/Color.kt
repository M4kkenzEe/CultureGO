package com.example.urwelcome.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val GreyBlue = Color(0xFFC3D3DF)

val Pink = Color(0xFFFCDFDF)

val gradientBackGround = Brush.linearGradient(
    colors = listOf(
        Color(0xFFFD9595),
        Color(0xFFFF7979).copy(alpha = 0f)
    ),
    end = Offset(1f, 0f),
    start = Offset.Infinite
)