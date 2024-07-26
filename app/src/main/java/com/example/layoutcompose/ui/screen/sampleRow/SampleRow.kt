package com.example.layoutcompose.ui.screen.sampleRow

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SamplerRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "text1",
            color = Color.Red
        )
        Text(
            text = "text2",
            color = Color.Red
        )
        Text(
            text = "text3",
            color = Color.Red
        )
        Text(
            text = "text4",
            color = Color.Red
        )
    }
}

@Preview
@Composable
private fun SampleRowPreview() {
    SamplerRow()
}