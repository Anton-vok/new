package com.example.anew.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.anew.R


@Composable
fun iconHome(){
    Box(
        Modifier
        .height(50.dp)
        .width(50.dp),){
        Image(
            painter = painterResource(id = R.drawable.home),
            contentDescription = "ДОМИК",
            modifier = Modifier.height(30.dp).width(30.dp).align(Alignment.Center)
        )
    }
}