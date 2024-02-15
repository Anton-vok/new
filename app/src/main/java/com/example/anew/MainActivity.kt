package com.example.anew

import com.example.anew.ui.MainTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.anew.list.addOp
import com.example.anew.list.mainScrean
import com.example.anew.list.tratList
import com.example.anew.ui.addAQ
import com.example.anew.ui.hederLine
import com.example.anew.ui.selectPanel

var theme= MainTheme(mutableStateOf(false))
//setting app
var screan = mutableStateOf(0)
var popApp = mutableStateOf(0)

//setting selectPanel
var adQR = mutableStateOf(true)

//setting addPanel
var type = mutableStateOf(true)

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
        if (screan.value!=0){
            if (screan.value==1){
                addAQ()
            }
        }else{
            hederLine()
        }
        
        //popApp
        if (popApp.value!=0){
            Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.fillMaxSize()){
                if (popApp.value==1){
                    selectPanel()
                }
                if (popApp.value==2){
                    addOp()
                }
            }
        }

    }
}