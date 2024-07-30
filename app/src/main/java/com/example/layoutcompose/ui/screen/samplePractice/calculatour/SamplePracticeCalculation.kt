package com.example.layoutcompose.ui.screen.samplePractice.calculatour

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SamplePracticeCalculation(modifier: Modifier = Modifier) {
    var number1 by remember {
        mutableStateOf(0)
    }
    var number2 by remember {
        mutableStateOf(0)
    }
    Row {
        TextField(
            modifier = modifier
                .weight(1f)
                .padding(11.dp),
            value = number1.toString(),
            onValueChange = { number1 = it.toInt() }
        )
        TextField(
            modifier = modifier
                .weight(1f)
                .padding(11.dp),
            value = number2.toString(),
            onValueChange = { number2 = it.toInt() }
        )
        Text(
            modifier = Modifier
                .padding(11.dp),
            text = "resualt ${number1 + number2}"
        )
    }

    Row() {
        TextField(
            modifier = Modifier
                .weight(1f)
                .padding(11.dp),
            value = number1.toString(),
            onValueChange = { number1 = it.toInt() }
        )
        TextField(
            modifier = Modifier
                .weight(1f)
                .padding(11.dp),
            value = number2.toString(),
            onValueChange = { number2 = it.toInt() }
        )
        Text(text = "resualt = ${number1 - number2}")
    }

    Row() {
        TextField(
            modifier = Modifier
                .weight(1f)
                .padding(11.dp),
            value = number1.toString(),
            onValueChange = { number1 = it.toInt() }
        )
        TextField(
            modifier = Modifier
                .weight(1f)
                .padding(11.dp),
            value = number2.toString(),
            onValueChange = { number2 = it.toInt() }
        )
        Text(text = "resualt = ${number1 - number2}")
    }
    Row() {
        TextField(
            modifier = Modifier
                .weight(1f)
                .padding(11.dp),
            value = number1.toString(),
            onValueChange = { number1 = it.toInt() }
        )
        TextField(
            modifier = Modifier
                .weight(1f)
                .padding(11.dp),
            value = number2.toString(),
            onValueChange = { number2 = it.toInt() }
        )
        Text(text = "resualt = ${number1 * number2}")
    }
}

@Preview
@Composable
private fun SamplePracticeCalculationPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        SamplePracticeCalculation()
    }
}
