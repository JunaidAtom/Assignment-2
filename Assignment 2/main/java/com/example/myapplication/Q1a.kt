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
////        modifier = Modifier.fillMaxWidth()
//    ) {
//        Image(painter =painterResource( R.drawable.q1), contentDescription = "ImageQ1")
//        Text(
//            text = "Jetpack Compose tutorial",
//            fontSize = 24.sp,
//            modifier = Modifier.padding(16.dp)
//        )
//        Text(
//            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
//            fontSize = 16.sp,
//            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
//            textAlign = TextAlign.Justify
//        )
//        Text(
//            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
//            fontSize = 16.sp,
//            modifier = Modifier.padding(start = 16.dp, end = 16.dp,bottom = 16.dp, top = 16.dp),
//            textAlign = TextAlign.Justify
//        )
//
//    }
//}