package com.example.layoutcompose.ui.screen.samplePractice.box_des

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Main_Practice(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        // Top Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.Blue),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = modifier
                    .background(Color.Blue),
                verticalArrangement = Arrangement.SpaceAround,
            ) {
                Text(
                    text = "test",
                    color = Color.White
                )
                Text(
                    text = "test1",
                    color = Color.White
                )
            }
            Text(
                text = "test22",
                color = Color.White
            )
            Text(
                text = "test23",
                color = Color.White
            )
        }
        // Middle Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.Blue),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Yellow),
                contentAlignment =
                Alignment.Center
            ) {
                Text(
                    text = "hello",
                    color = Color.White

                )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "how_Are_YOUsdfsdfsdfsdfsdfsdfsdfsdfdsfsdfsdfdsdcfsfsdfsdfdsfsd",
                    color = Color.White
                )
            }
        }
        // Bottom Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.Red),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                modifier = modifier,
                verticalArrangement = Arrangement.SpaceAround,
            ) {
                Text(
                    text = "test",
                    color = Color.White
                )
                Text(text = "test1", color = Color.White)
            }
            Text(text = "test22", color = Color.White)
            Text(text = "test", color = Color.White)
        }
    }
}

@Preview
@Composable
private fun Main_Preview() {
    Main_Practice()
}