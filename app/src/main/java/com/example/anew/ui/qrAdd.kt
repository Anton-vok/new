package com.example.anew.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.anew.popApp
import com.example.anew.screan
import com.example.anew.theme

@Composable
fun addAQ(){
    Column(Modifier.fillMaxSize().background(Color(0xFFF7F7F7)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text("Добавление по QR пока в разработке", fontSize = 30.sp)
        Row(
            Modifier.height(50.dp).width(160.dp).background(Color.White, shape = RoundedCornerShape(30.dp))
                .clickable {
                    popApp.value = 0
                    screan.value = 0
                }
        ) {
            iconHome()
        }
    }
}
