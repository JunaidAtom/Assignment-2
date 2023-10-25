package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.ColumnScopeInstance.align
//import androidx.compose.foundation.layout.ColumnScopeInstance.align
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinalLayout()
        }
    }
}
@Composable
//@Preview(showBackground = true)
fun locations() {
    Row(
//        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .weight(0.7f)
                .height(300.dp)
//                .background(color = Color.Gray)
        ) {
            Text(
                text = "LOCATIONS",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "You are currently getting results for popular places from Pakistan.",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )

            Button(
                onClick = { },
                modifier = Modifier
                    .height(35.dp)
                    .width(95.dp)
                    .padding(5.dp)
                    .align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
            ) {
                Text(text = "Choose Place", fontSize = 6.sp, fontWeight = FontWeight.Bold,
                    color=Color.Black)
            }
        }
        Column(
            modifier = Modifier
                .height(300.dp)
                .weight(0.3f)
                .background(color = Color.Gray),
            verticalArrangement = Arrangement.Center

        ) {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "+",
                    fontSize = 25.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                )
                Text(
                    text = "Add Place",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun Cities(name:String,humidity:String,temp:String,bgColor:String) {
    val skyBlueColor = Color(0xFF87CEEB)
    Row(
        modifier = Modifier.background(skyBlueColor)    ) {
        Column(
            modifier = Modifier
                .weight(0.7f)
                .height(100.dp)
//                .background(color = Color.Gray)
        ) {
            Text(
                text = "$name",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(5.dp)
            )
            Text(
                text = "Humidity: $humidity%",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
        }
        Column(
            modifier = Modifier
                .height(100.dp)
                .weight(0.3f),
            verticalArrangement = Arrangement.Center

        ) {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "$temp",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                )
            }
        }
    }
}
@Composable
fun Cities(name:String,humidity:String,temp:String,) {
    Row(
        modifier = Modifier.background(color=Color.Gray)) {
        Column(
            modifier = Modifier
                .weight(0.7f)
                .height(100.dp)
//                .background(color = Color.Gray)
        ) {
            Text(
                text = "$name",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(5.dp)
            )
            Text(
                text = "Humidity: $humidity%",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
        }
        Column(
            modifier = Modifier
                .height(100.dp)
                .weight(0.3f),
            verticalArrangement = Arrangement.Center

        ) {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "$temp",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                )
            }
        }
    }
}

@Composable
fun FinalLayout(){
    Column()
    {
        locations()
        Cities(name = "Lahore", humidity = "33", temp ="27, Smoke" , bgColor = "Blue" )
        Cities(name = "Islamabad", humidity = "27", temp ="22, Clear" )
        Cities(name = "Karachi", humidity = "35", temp ="30, Sunny" )
        Cities(name = "Sheikhupura", humidity = "29", temp ="23, Cloudy" )
    }
}
