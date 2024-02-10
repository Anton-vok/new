package com.example.anew

import com.example.anew.ui.MainTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.anew.forPy.py
import com.example.anew.list.addOp

var theme= MainTheme(mutableStateOf(false))

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mainBox()
        }
    }
}

@Composable
fun mainBox(){
    Column(
        Modifier
            .fillMaxSize()
            .background(theme.background)
    ){
        hederLine(mutableStateOf(1))
        Button(onClick = {
            var h= py()
            h.pr()
        }){

        }
        Box(Modifier.background(Color.White)){addOp(list = mutableStateOf(1))}

    }
}