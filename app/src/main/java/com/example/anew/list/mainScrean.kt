package com.example.anew.list

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.example.anew.type
import com.example.anew.ui.hederLine
import com.example.anew.ui.iconAdd
import com.example.anew.ui.iconHome
import com.example.anew.ui.iconQR

@Composable
fun mainScrean(){
    Column{
        hederLine()
        Text("Здравствуйте", fontSize = 25.sp)
        Box(Modifier.height(20.dp))
        Row(Modifier.fillMaxWidth()){
            Box(Modifier.height(10.dp))
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
                Box(Modifier.height(10.dp))
                Box(
                    Modifier.fillMaxHeight().width(50.dp)
                        .background(Color.White, shape = RoundedCornerShape(30.dp))
                        .clickable {
                            popApp.value = 0
                            screan.value = 1
                        }) { iconQR() }

                Box(Modifier.height(10.dp))

                Row(Modifier.fillMaxWidth().height(50.dp)) {

                    Box(Modifier.width(10.dp))

                    Row(
                        Modifier.fillMaxHeight().width(160.dp).background(theme.panel, shape = RoundedCornerShape(30.dp))
                            .clickable {
                                popApp.value=2
                                type.value=true
                            }
                    ) { iconAdd() }
                }
            }
        }


    }
}