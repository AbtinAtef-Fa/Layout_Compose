package com.example.layoutcompose.ui.screen.samplePractice.bmi_sc

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Bmi(modifier: Modifier = Modifier) {
    var weight by remember { mutableStateOf("") }
    var height by remember { mutableStateOf("") }
    var bmiResult by remember { mutableStateOf<Double?>(null) }
    val bmiColor = GetBmiColor(bmiResult)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "BMI_calculator")
        Row {
            TextField(
                modifier = modifier
                    .weight(1f)
                    .padding(12.dp),
                value = weight,
                onValueChange = { weight = it },
                label = { Text("وزن (kg)") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            TextField(
                modifier = modifier
                    .weight(1f)
                    .padding(12.dp),
                value = height,
                onValueChange = { height = it },
                label = { Text("قد (metric)") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
        }
        ElevatedButton(onClick = {
            val weightValue = weight.toDoubleOrNull()
            val heightValue = height.toDoubleOrNull()

            if (weightValue != null && heightValue != null && heightValue > 0) {
                bmiResult = calculateBmi(weightValue, heightValue)
            } else {
                Toast.makeText(null, "not value", Toast.LENGTH_LONG).show();
            }
        }) {
            Text(" BMI")
        }
        bmiResult?.let {
            Text(
                text = "BMI: %.2f".format(it),
                color = bmiColor,
                fontSize = 52.sp
            )
        }
    }
}

fun GetBmiColor(bmi: Double?): Color {
    return when {
        bmi == null -> Color.Black
        bmi < 18.5 -> Color.Blue
        bmi < 24.9 -> Color.Green
        bmi < 29.9 -> Color.Yellow
        else -> Color.Red
    }
}

fun calculateBmi(weight: Double, height: Double): Double {
    return weight / (height * height)
}

@Preview(showBackground = true)
@Composable
private fun BMI_Sc() {
    Bmi()
}