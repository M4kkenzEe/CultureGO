package com.example.urwelcome.login.presenter.view.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.urwelcome.R
import com.example.urwelcome.ui.theme.GreyBlue

@Composable
fun BasicButton(modifier: Modifier = Modifier, buttonText: Int, click: () -> Unit) {
    Button(
        onClick = click,
        modifier = modifier
            .width(174.dp)
            .height(50.dp)
            .background(
                color = GreyBlue,
                shape = RoundedCornerShape(size = 25.dp)
            ),
        colors = ButtonDefaults.buttonColors(containerColor = GreyBlue),
    ) {
        Text(text = stringResource(id = buttonText), color = Color.Black)
    }
}


@Composable
fun BasicButtonPrev() {
    BasicButton(buttonText = R.string.registration) {}
}