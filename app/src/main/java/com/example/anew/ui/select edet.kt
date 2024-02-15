package com.example.anew.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.anew.R
import com.example.anew.adQR
import com.example.anew.controlApp
import com.example.anew.popApp
import com.example.anew.screan
import com.example.anew.type

@Composable
fun selectPanel(){
    Column (Modifier.fillMaxWidth().background(Color(0xFFF7F7F7))) {
        Box(Modifier.height(20.dp))

        Row(Modifier.fillMaxWidth().height(30.dp)){
            Box(Modifier.width(20.dp))
            Image(
                painter = painterResource(id = R.drawable.add),
                contentDescription = "ПЛЮСИК",
                modifier = Modifier.size(30.dp)
            )
        }

        Box(Modifier.height(20.dp))

        Row(
            Modifier
                .background(Color.White, shape = RoundedCornerShape(30.dp))
                .fillMaxWidth()
                .height(85.dp)
                .padding(horizontal = 10.dp)
                .clickable {
                           popApp.value=2
                    type.value=true
                },
            verticalAlignment = Alignment.CenterVertically
        ){
            Box(Modifier.width(10.dp))
            Image(
                painter = painterResource(id = R.drawable.qr),
                contentDescription = "ПЛЮСИК",
                modifier = Modifier.size(50.dp)
            )
            Box(Modifier.width(15.dp))
            Text("Добавить списание", fontSize = 22.sp)
        }

        Box(Modifier.height(10.dp))

        Row(
            Modifier
                .background(Color.White, shape = RoundedCornerShape(30.dp))
                .fillMaxWidth()
                .height(85.dp)
                .padding(horizontal = 10.dp)
                .clickable {
                    popApp.value=2
                    type.value=false
                },
            verticalAlignment = Alignment.CenterVertically
        ){
            Box(Modifier.width(10.dp))
            Image(
                painter = painterResource(id = R.drawable.qr),
                contentDescription = "ПЛЮСИК",
                modifier = Modifier.size(50.dp)
            )
            Box(Modifier.width(15.dp))
            Text("Добавить списание", fontSize = 22.sp)
        }

        if (adQR.value){
            Box(Modifier.height(20.dp))

            Row(
                Modifier
                    .background(Color.White, shape = RoundedCornerShape(30.dp))
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(horizontal = 10.dp)
                    .clickable {
                        popApp.value = 0
                        screan.value = 1
                    },
                verticalAlignment = Alignment.CenterVertically
            ){
                Box(Modifier.width(10.dp))
                Image(
                    painter = painterResource(id = R.drawable.qr),
                    contentDescription = "ПЛЮСИК",
                    modifier = Modifier.size(30.dp).clickable {
                        adQR.value = false
                    }
                )
                Box(Modifier.width(15.dp))
                Text("Попробуйте добавить по QR", fontSize = 22.sp)
            }
        }

        Box(Modifier.height(20.dp))
    }
}
