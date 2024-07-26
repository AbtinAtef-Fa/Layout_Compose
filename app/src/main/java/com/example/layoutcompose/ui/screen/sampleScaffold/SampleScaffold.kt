package com.example.layoutcompose.ui.screen.sampleScaffold

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SampleScaffold(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        topBar = {
            TopBarSampleScaffold()
        },

        bottomBar = {
            BottomBarSampleScaffold()
        },


        ) { innerPadding ->

        Column(
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(Color.Blue)
        ) {
            Text(
                text = "خوش آمدید",
                color = Color.White
            )
        }

    }
}

@Composable
fun TopBarSampleScaffold(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Red)
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceAround

    ) {
        Text(
            text = "خوش آمدید",
            color = Color.White
        )
        Text(
            text = "به اپلیکیشن خود",
            color = Color.White
        )
    }
}

@Composable
fun BottomBarSampleScaffold(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier

            .fillMaxWidth()
            .background(Color.Red)
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceAround

    ) {
        Text(
            text = "نسخه 0.0.1",
            color = Color.White
        )
    }
}

@Preview
@Composable
private fun SampleScaffoldPreview() {
    SampleScaffold()
}