package com.example.anew.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerState

import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.anew.hederLine
import com.example.anew.ui.NewPanelInput
import com.example.anew.ui.hedersTextStyleLight
import java.time.format.TextStyle

@Composable
fun addOp(type: Boolean = true, list: MutableState<Int>){
    val full = remember{ mutableStateOf(false) }
    val textOp = if (type) {"Добавить списание"} else {"Добавить пополнение"}
    LazyColumn(Modifier.fillMaxSize()){
        item {

            hederLine(list = list, full = full)

            Row(Modifier.fillMaxWidth()){
                Box(Modifier.width(10.dp))
                Text(textOp, style = hedersTextStyleLight)
            }

            Box(Modifier.height(20.dp))

            Box(
                Modifier
                    .fillMaxWidth()
                    .height(50.dp)){NewPanelInput(endOne = remember {mutableStateOf("aaa")})}

            Box(Modifier.height(20.dp))

            Box(
                Modifier
                    .fillMaxWidth()
                    .height(50.dp)){NewPanelInput(endOne = remember {mutableStateOf("aaa")})}

            Box(Modifier.height(20.dp))


        }
    }
}