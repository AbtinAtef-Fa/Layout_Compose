package com.example.layoutcompose.ui.screen.samplePractice.bmi


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedButton
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

@Composable
fun BMICalculatorApp(modifier: Modifier = Modifier) {
    var w by remember { mutableStateOf("") }
    var h by remember { mutableStateOf("") }
    var bmiResult by remember { mutableStateOf("") }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
    ) {


        TextField(
            modifier = Modifier
                .weight(1f)
                .padding(15.dp),
            value = w,
            onValueChange = { w = it },
            label = { Text(text = "vazn (kg)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        TextField(
            modifier = Modifier
                .weight(1f)
                .padding(15.dp),
            value = h,
            onValueChange = { h = it },
            label = { Text(text = "gad (cm)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }
    Column {
        OutlinedButton(
            /**
             *chek the resualt
             * see [and convert]
             */
            /**
             *chek the resualt
             * see [and convert]
             */
            onClick = {
                val wwV = w.toDoubleOrNull()
                val hhV = h.toDoubleOrNull()
                if (wwV != null && hhV != null) {
                    val bm = cal(wwV, hhV)
                    bmiResult = "todeh :$bm"

                } else {
                    bmiResult = "treu in text fild"
                }
            }
        ) {
            Text(text = "BMI_calcuted")
        }
    }
    Text(bmiResult)
}

fun cal(we: Double, he: Double): Double {
    val him = he / 100
    return we / (him * him)
}

@Preview()
@Composable
fun BMICalculatorAppPreview() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BMICalculatorApp()
    }
}