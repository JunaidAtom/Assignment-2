//package com.example.myapplication
//
//
//import android.os.Bundle
//import android.widget.Button
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
////import androidx.compose.foundation.layout.ColumnScopeInstance.align
////import androidx.compose.foundation.layout.ColumnScopeInstance.align
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.material.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.ColorFilter
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.myapplication.ui.theme.MyApplicationTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            Screen1()
//        }
//    }
//}
//@Composable
//@Preview(showBackground = true)
//fun Screen1() {
//    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Image(painter =painterResource( R.drawable.q1b), contentDescription = "ImageQ1")
//        Text(
//            text = "All tasks completed",
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier.padding(top = 24.dp, bottom=8.dp)
//        )
//        Text(
//            text = "Nice Work",
//            fontSize = 16.sp
//        )
//
//    }
//}