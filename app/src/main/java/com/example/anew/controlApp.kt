package com.example.anew

import androidx.compose.runtime.mutableStateOf

class controlApp {
    //setting app
    var screan = mutableStateOf(0)
    var popApp = mutableStateOf(0)

    //setting selectPanel
    var adQR = mutableStateOf(true)

    //setting addPanel
    var type = mutableStateOf(true)
}