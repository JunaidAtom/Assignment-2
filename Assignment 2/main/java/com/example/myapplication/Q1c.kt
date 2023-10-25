//package com.example.myapplication
//
//import android.os.Bundle
//import android.widget.Button
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
////import androidx.compose.foundation.layout.ColumnScopeInstance.weight
////import androidx.compose.foundation.layout.RowScopeInstance.weight
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
//            finalLayout()
//        }
//    }
//}
//@Composable
////@Preview(showBackground = true)
//fun Screen1() {
//    Row(
////        modifier = Modifier.fillMaxWidth()
//    ) {
//        Column(
//            modifier = Modifier
//                .weight(0.5f)
//                .fillMaxHeight(0.5f)
//                .padding(start = 16.dp, end = 16.dp,bottom = 16.dp, top = 16.dp),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(
//                text = "Text Composable",
//                fontWeight = FontWeight.Bold,
//                modifier = Modifier.padding(bottom = 8.dp)
//            )
//            Text(
//                text = "Displays text and follows the recommended Material Design guidelines.",
//            )
//
//        }
//        Column(
//            modifier = Modifier
//                .fillMaxHeight(0.5f)
//                .weight(0.5f)
//                .background(color = Color.Gray)
//                .padding(start = 16.dp, end = 16.dp,bottom = 16.dp, top = 16.dp),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//
//        ) {
//            Column(
//                verticalArrangement = Arrangement.SpaceEvenly
//            ) {
//                Text(
//                    text = "Image Composable",
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier.padding(bottom = 8.dp)
//                )
//                Text(
//                    text = "Creates a composable that lays out and draws a given Painter class object.",
//                )
//            }
//        }
//    }
//}
//@Composable
//fun Screen2() {
//    Row(
////        modifier = Modifier.fillMaxWidth()
//    ) {
//        Column(
//            modifier = Modifier
//                .weight(0.5f)
//                .fillMaxHeight(0.5f)
//                .padding(start = 16.dp, end = 16.dp,bottom = 16.dp, top = 16.dp),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(
//                text = "Row Composable",
//                fontWeight = FontWeight.Bold,
//                modifier = Modifier.padding(bottom = 8.dp)
//            )
//            Text(
//                text = "A layout composable that places its children in a horizontal sequence.",
//            )
//
//        }
//        Column(
//            modifier = Modifier
//                .fillMaxHeight(0.5f)
//                .weight(0.5f)
//                .background(color = Color.Gray)
//                .padding(start = 16.dp, end = 16.dp,bottom = 16.dp, top = 16.dp),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//
//        ) {
//            Column(
//                verticalArrangement = Arrangement.SpaceEvenly
//            ) {
//                Text(
//                    text = "Column Composable",
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier.padding(bottom = 8.dp)
//                )
//                Text(
//                    text = "A layout composable that places its children in a vertical sequence.",
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun finalLayout()
//{
//    Column {
//        Screen1()
//        Screen2()
//    }
//}
//
