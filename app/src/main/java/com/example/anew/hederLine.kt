package com.example.anew

import MainTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.anew.ui.theme.iconHome


@Composable
fun hederLine(
    full: MutableState<Boolean> = mutableStateOf(true),
    theme: MainTheme = MainTheme()
){
    Column(
        Modifier
            .fillMaxWidth()
            .height(80.dp)
    ){
        Box(Modifier.height(10.dp))
        Row(Modifier.fillMaxWidth().height(50.dp)){

            Box(Modifier.width(10.dp))

            Row(
                Modifier
                    .fillMaxHeight()
                    .width(160.dp)
                    .background(theme.panel, shape = RoundedCornerShape(30.dp))
            ){
                iconHome()
            }

            for (i in 0..2){
                Box(Modifier.width(10.dp))

                Box(
                    Modifier
                        .fillMaxHeight()
                        .width(50.dp)
                        .background(theme.panel, shape = RoundedCornerShape(30.dp))
                ){
                    iconHome()
                }
            }

        }
        Box(Modifier.height(20.dp))
    }
}