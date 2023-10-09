package com.example.urwelcome.login.presenter.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.urwelcome.R
import com.example.urwelcome.login.presenter.view.utils.BasicEmailTextField
import com.example.urwelcome.login.presenter.view.utils.BasicPasswordTextField
import com.example.urwelcome.login.presenter.view.utils.BasicButton
import com.example.urwelcome.ui.theme.GreyBlue

@Composable
fun LoginScreen(
    loginClick: () -> Unit = {},
    forgotPasswordClick: () -> Unit = {}
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_main),
            contentDescription = "",
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 95.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = stringResource(R.string.loginig),
                fontSize = 32.sp,
                color = Color.White,
                fontWeight = FontWeight(700),
                modifier = Modifier.padding(bottom = 200.dp)
            )

            InputFieldsScreen()
            Text(
                text = stringResource(id = R.string.forgot_password),
                color = GreyBlue,
                fontWeight = FontWeight(400),
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .clickable { forgotPasswordClick() }
            )

            BasicButton(
                modifier = Modifier.padding(top = 38.dp),
                buttonText = R.string.sign_in
            ) { loginClick() }
        }
    }
}

@Composable
fun InputFieldsScreen() {
    Column(
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = stringResource(id = R.string.email),
            fontSize = 16.sp,
            fontWeight = FontWeight(400),
            color = Color.Black,
            modifier = Modifier.padding(top = 10.dp, start = 10.dp, bottom = 8.dp)
        )
        BasicEmailTextField()
        Text(
            text = stringResource(id = R.string.password),
            fontSize = 16.sp,
            fontWeight = FontWeight(400),
            color = Color.Black,
            modifier = Modifier.padding(top = 10.dp, start = 10.dp)
        )
        BasicPasswordTextField(modifier = Modifier.padding(top = 8.dp))
    }
}

@Composable
@Preview
fun LoginScreenPrev() {
    LoginScreen()
//    InputFieldsScreen()
}
