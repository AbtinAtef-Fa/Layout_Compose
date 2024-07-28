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
import com.example.layoutcompose.ui.theme.bb
import com.example.layoutcompose.ui.theme.blue
import com.example.layoutcompose.ui.theme.green
import com.example.layoutcompose.ui.theme.yellow

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
                .background(blue),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = modifier
                    .background(blue),
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
                .background(bb),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(yellow),
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
                    .background(green),
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