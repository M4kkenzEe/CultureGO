package com.example.urwelcome.login.presenter.view.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import com.example.urwelcome.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.urwelcome.ui.theme.GreyBlue

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun BasicPasswordTextField(modifier: Modifier = Modifier) {
    var tfText by remember {
        mutableStateOf("")
    }
    var visibilityState by remember {
        mutableStateOf(false)
    }
    val imeAction = remember { ImeAction.Done }

    OutlinedTextField(
        value = tfText,
        onValueChange = { tfText = it },
        trailingIcon = {
            IconButton(
                onClick = { visibilityState = !visibilityState }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_eye_password),
                    contentDescription = null,
                    tint = GreyBlue
                )
            }
        },
        visualTransformation = if (visibilityState) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        },
        textStyle = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight(400),
            color = Color.Black,
            textAlign = TextAlign.Start,
        ),

        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            disabledBorderColor = Color.Transparent
        ),
        modifier = modifier
            .border(
                width = 1.dp,
                color = GreyBlue,
                shape = RoundedCornerShape(size = 25.dp)
            )
            .background(
                color = Color.White,
                shape = RoundedCornerShape(size = 25.dp)
            )
            .width(246.dp),
        maxLines = 1,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = imeAction,
        ),
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasicEmailTextField(modifier: Modifier = Modifier) {
    var tfText by remember {
        mutableStateOf("")
    }
    val imeAction = remember { ImeAction.Done }

    OutlinedTextField(
        value = tfText,
        onValueChange = { tfText = it },
        textStyle = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight(400),
            color = Color.Black,
            textAlign = TextAlign.Start,
        ),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
            disabledBorderColor = Color.Transparent
        ),
        modifier = modifier
            .border(
                width = 1.dp,
                color = GreyBlue,
                shape = RoundedCornerShape(size = 25.dp)
            )
            .background(
                color = Color.White,
                shape = RoundedCornerShape(size = 25.dp)
            )
            .width(246.dp),
        maxLines = 1,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = imeAction,
        )
    )
}


@Composable
@Preview
fun BasicTextFieldPrev() {
    Column {
        BasicPasswordTextField()
        Spacer(modifier = Modifier.height(10.dp))
        BasicEmailTextField()
    }
}