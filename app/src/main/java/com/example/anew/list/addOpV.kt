package com.example.anew.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider

import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.anew.R
import com.example.anew.controlApp
import com.example.anew.popApp
import com.example.anew.type
import com.example.anew.ui.NewPanelInput
import com.example.anew.ui.cashEnter
import com.example.anew.ui.textButton

@Composable
fun addOp(){

    var name = remember { mutableStateOf("Название") }
    var summa = remember { mutableStateOf("100") }
    var category = remember { mutableStateOf("Категория") }

    val textOp = if (type.value) {"Добавить списание"} else {"Добавить пополнение"}

    LazyColumn(Modifier.fillMaxWidth().background(Color(0xFFF7F7F7))){
        item {
            Box(Modifier.height(15.dp))

            Row(
                Modifier
                    .fillMaxWidth()
                    .height(30.dp)){
                Box(Modifier.width(10.dp))
                Image(
                    painter = painterResource(id = R.drawable.add),
                    contentDescription = "back",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable { popApp.value = 0 }
                )
                Box(Modifier.width(10.dp))
                Text(textOp, fontSize = 24.sp)
            }


            Box(Modifier.height(10.dp))
            Divider(
                Modifier
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(Color.Black))
            Box(Modifier.height(15.dp))

            Box(
                Modifier
                    .fillMaxWidth()
                    .height(50.dp)){
                NewPanelInput(endOne = remember {mutableStateOf("aaa")})
            }

            Box(Modifier.height(10.dp))

            Row(
                Modifier
                    .fillMaxWidth()
                    .height(110.dp)){
                Box(
                    Modifier
                        .fillMaxHeight()
                        .weight(0.55f)){
                    cashEnter(endOne = remember {mutableStateOf("10000")})
                }
                Box(
                    Modifier
                        .fillMaxHeight()
                        .weight(0.45f)){
                    Text("Ввод даты пока в разработке", style = androidx.compose.ui.text.TextStyle(fontFamily = FontFamily.SansSerif, color = Color(0xFF333333), fontSize = 24.sp, fontWeight = FontWeight.Bold)
                    )
                }
            }

            Box(Modifier.height(10.dp))

            Box(
                Modifier
                    .fillMaxWidth()
                    .height(50.dp)){
                NewPanelInput(endOne = remember {mutableStateOf("aaa")})
            }

            Box(Modifier.height(20.dp))

            Row(
                Modifier
                    .fillMaxWidth()
                    .height(50.dp), horizontalArrangement = Arrangement.Center){
                Box(
                    Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(0.5f)){
                    textButton(onClick = { popApp.value = 0 }, text = mutableStateOf("Сохранить"))
                }
            }

            Box(Modifier.height(30.dp))
        }
    }
}