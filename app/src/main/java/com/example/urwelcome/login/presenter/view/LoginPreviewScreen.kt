package com.example.urwelcome.login.presenter.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.urwelcome.R
import com.example.urwelcome.login.presenter.view.utils.BasicButton
import com.example.urwelcome.ui.theme.Pink

@Composable
fun LoginPreviewScreen(
    signInClick: () -> Unit = {},
    registrationClick: () -> Unit = {}
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg1),
            contentDescription = "",
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_matreshka),
                    contentDescription = null
                )
                Text(
                    text = stringResource(id = R.string.app_label_name),
                    fontSize = 32.sp,
                    fontWeight = FontWeight(700),
                    color = Color.White
                )
            }
            Text(
                text = stringResource(id = R.string.app_label_second),
                textAlign = TextAlign.Center,
                color = Pink,
                fontSize = 32.sp,
                fontWeight = FontWeight(700),
                modifier = Modifier.padding(bottom = 32.dp)
            )
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                BasicButton(buttonText = R.string.registration) { registrationClick() }
                SingInClickableText(modifier = Modifier.padding(top = 10.dp)) { signInClick() }
            }
        }
    }
}

@Composable
fun SingInClickableText(modifier: Modifier = Modifier, onClick: () -> Unit) {
    val annotatedText = buildAnnotatedString {
        append(stringResource(id = R.string.have_acc))
        append(" ")
        pushStringAnnotation(tag = "SignIn", annotation = "Clickable text")
        withStyle(style = SpanStyle(color = Color.Blue)) {
            append(stringResource(id = R.string.sign_in))
        }
        pop()
    }

    ClickableText(
        modifier = modifier,
        text = annotatedText,
        style = MaterialTheme.typography.body1.copy(fontSize = 12.sp),
        onClick = { offset ->
            annotatedText.getStringAnnotations("SignIn", offset, offset)
                .firstOrNull()?.let { annotation ->
                    if (annotation.item == "Clickable text") {
                        onClick()
                    }
                }
        }
    )
}

@Composable
@Preview
fun LoginPreviewScreenPrev() {
    LoginPreviewScreen()
//    SingInClickableText {
//
//    }
}