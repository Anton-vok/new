package com.example.anew.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class NewPanelInputStyleNew{
    var textStyle = TextStyle(
        fontFamily = FontFamily.SansSerif,
        color = Color(0xFF3333FF),
        fontSize = 38.sp,
        fontWeight = FontWeight.Bold
    )
    var focusColor = mutableStateOf(Color(115, 32, 239))
    var dontFocusColor = mutableStateOf(Color(145, 151, 153))
    var backgraoundColor = mutableStateOf(Color(0xFFFFFFFF))
    var singleLine = true
    var shape = 30.dp
    var stepHorizontal = 10.dp
    var stepVertical = 0.dp
    var textStep = 10.dp
    var namber = false
}

@Composable
fun cashEnter(
    endOne: MutableState<String>,
    myFocus: MutableState<Boolean> = mutableStateOf(false),
    style: NewPanelInputStyleNew = NewPanelInputStyleNew() ){

    var colorDay= if(myFocus.value) style.focusColor.value else style.dontFocusColor.value

    Box(Modifier.fillMaxSize().padding(horizontal = style.stepHorizontal, vertical = style.stepVertical)){

        Box(
            modifier = Modifier
                .fillMaxSize()
                .border(1.dp, colorDay, shape = RoundedCornerShape(style.shape))
                .background(style.backgraoundColor.value, shape = RoundedCornerShape(style.shape))
        ) {
            BasicTextField(
                value = endOne.value.format(",###,###,###"),
                onValueChange = { endOne.value = it },
                Modifier
                    .fillMaxSize()
                    .align(Alignment.CenterEnd)
                    .padding(horizontal = style.textStep, vertical = 8.dp)
                    .onFocusChanged { focusState -> myFocus.value = focusState.isFocused },
                singleLine = true,
                textStyle = style.textStyle,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                maxLines = 9
                )
        }

    }
}