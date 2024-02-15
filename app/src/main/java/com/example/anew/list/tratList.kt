package com.example.anew.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.anew.ui.hederLine

@Composable
fun tratList(){
    LazyColumn(Modifier.fillMaxSize().background(Color(0xFFF9F9F9))){
        item{
            hederLine()
            Row(Modifier.fillMaxSize()){
                Box(Modifier.weight(0.5f).padding(10.dp)){
                    Box(Modifier.fillMaxWidth().aspectRatio(1f).background(Color.White))
                }
                Box(Modifier.weight(0.5f).padding(10.dp)){
                    Box(Modifier.fillMaxWidth().aspectRatio(1f).background(Color.White))
                }
            }
        }

    }
}