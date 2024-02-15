package com.example.anew.ui

import com.example.anew.ui.MainTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.anew.controlApp
import com.example.anew.popApp
import com.example.anew.screan
import com.example.anew.ui.iconAdd
import com.example.anew.ui.iconHome
import com.example.anew.ui.iconQR


@Composable
fun hederLine(
    full: MutableState<Boolean> = mutableStateOf(true),
    theme: MainTheme = MainTheme()
) {
    Column(
        Modifier.fillMaxWidth().height(80.dp)
    ) {
        Box(Modifier.height(10.dp))
        Row(Modifier.fillMaxWidth().height(50.dp)) {

            Box(Modifier.width(10.dp))

            Row(
                Modifier.fillMaxHeight().width(160.dp).background(theme.panel, shape = RoundedCornerShape(30.dp))
                    .clickable {
                        popApp.value = 0
                        screan.value = 0
                    }
            ) {
                iconHome()
            }

            if (full.value) {

                Box(Modifier.width(10.dp))

                Box(
                    Modifier.fillMaxHeight().width(50.dp)
                        .background(theme.panel, shape = RoundedCornerShape(30.dp))
                        .clickable { popApp.value = 1 }
                ) {
                    iconAdd()
                }

                Box(Modifier.width(10.dp))

                Box(
                    Modifier.fillMaxHeight().width(50.dp)
                        .background(theme.panel, shape = RoundedCornerShape(30.dp))
                        .clickable {
                            popApp.value = 0
                            screan.value = 1
                        }
                ) {
                    iconQR()
                }
            }
        }
        Box(Modifier.height(20.dp))
    }
}