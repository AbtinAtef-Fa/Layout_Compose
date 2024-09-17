package com.example.layoutcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import com.example.layoutcompose.ui.screen.samplePractice.Todo.Todo_nameSen
import com.example.layoutcompose.ui.theme.LayoutComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutComposeTheme {
//                ScCaL()
                Todo_nameSen()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LayoutComposeTheme {

    }
}