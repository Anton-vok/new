package com.example.anew.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFFFFFFF)
val textColorLight = Color(0xFF333333)

class MainTheme(
    var dark: MutableState<Boolean> = mutableStateOf(false)
){
    var background=if (dark.value) {
        Purple80
    } else {
        Purple80
    }
    var panel= if (dark.value) {
        PurpleGrey80
    } else {
        PurpleGrey80
    }

}

var hedersTextStyleLight= TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Black, color = textColorLight)

var textStyle4=TextStyle(
    fontFamily = FontFamily.SansSerif,
    color = textColorLight,
    fontSize = 15.sp,
    fontWeight = FontWeight.Bold
)