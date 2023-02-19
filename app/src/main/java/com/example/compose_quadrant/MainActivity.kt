package com.example.compose_quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_quadrant.ui.theme.Compose_quadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_quadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun AlignQuadrant() {
    Column() {
        Row(){
            Box(modifier = Modifier
                .background(color = Color.Green)
                .weight(1f)
                .fillMaxHeight(.5f)
                .wrapContentWidth(Alignment.Start)){
                    Column(modifier = Modifier.padding(all = 16.dp).fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                        Text(text = "Text composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                        Text(text = "Displays text and follows Material Design guidelines.", textAlign = TextAlign.Justify)
                    }
            }
            Box(modifier = Modifier
                .background(color = Color.Yellow)
                .weight(1f)
                .fillMaxHeight(.5f)
                .wrapContentWidth(Alignment.End)){
                Column(modifier = Modifier.padding(all = 16.dp).fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Text(text = "Image composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                    Text(text = "Creates a composable that lays out and draws a given Painter class object.", textAlign = TextAlign.Justify)
                }
            }
        }
        Row() {
            Box(modifier = Modifier
                .background(color = Color.Cyan)
                .weight(1f)
                .fillMaxHeight()
                .wrapContentWidth(Alignment.Start)){
                Column(modifier = Modifier.padding(all = 16.dp).fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Text(text = "Row composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                    Text(text = "A layout composable that places its children in a horizontal sequence.", textAlign = TextAlign.Justify)
                }
            }
            Box(modifier = Modifier
                .background(color = Color.LightGray)
                .weight(1f)
                .fillMaxHeight()
                .wrapContentWidth(Alignment.End)){
                Column(modifier = Modifier.padding(all = 16.dp).fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Text(text = "Column composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                    Text(text = "A layout composable that places its children in a vertical sequence.", textAlign = TextAlign.Justify)
                }
            }

        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Compose_quadrantTheme {
       AlignQuadrant()
    }
}