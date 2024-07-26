package com.example.layoutcompose.ui.screen.sampleBox

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SampleBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.TopCenter
    ) {
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Red),
            contentAlignment = Alignment.BottomStart

        ) {
            Text(
                text = "text1",
                color = Color.White
            )
        }

        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Blue),
            Alignment.Center
        ) {
            Text(
                text = "text2",
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
private fun SampleBoxPreview() {
    SampleBox()
}