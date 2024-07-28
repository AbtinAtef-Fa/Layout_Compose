package com.example.layoutcompose.ui.screen.samplePractice.couter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.layoutcompose.ui.theme.White


@Composable
fun Main_counter(modifier: Modifier = Modifier) {
    var Start_number by remember {
        mutableStateOf(0)
    }

    Text(text = "start  _ by _ current Number: $Start_number ")
    OutlinedButton(
        onClick = { Start_number += 2 }
    ) {
        Text(text = "start_inc")
    }
    OutlinedButton(
        onClick = { Start_number -= 5 }
    ) {
        Text(text = "Minez")
    }
    OutlinedButton(onClick = { Start_number = 0 }
    ) {
        Text(text = "Reset")
    }
}

@Preview
@Composable
private fun Preview_Test() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Main_counter()
    }
}