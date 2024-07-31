package com.example.layoutcompose.ui.screen.samplePractice.calculatour

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.math.*

@Composable
fun Calculator_App() {
    var angle by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = angle,
            onValueChange = { angle = it },
            label = { Text("زاویه (درجه)") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(onClick = {
                result = calculate(angle, "sin")
            }) { Text("sin") }
            Button(onClick = {
                result = calculate(angle, "cos")
            }) { Text("cos") }
            Button(onClick = {
                result = calculate(angle, "tan")
            }) { Text("tan") }
            Button(onClick = {
                result = calculate(angle, "cot")
            }) { Text("cot") }
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "نتیجه: $result")
    }
}

fun calculate(angle: String, operator: String): String {
    val radians = angle.toDoubleOrNull()?.let { Math.toRadians(it) }
    return if (radians != null) {
        when (operator) {
            "sin" -> sin(radians).toString()
            "cos" -> cos(radians).toString()
            "tan" -> tan(radians).toString()
            "cot" -> if (tan(radians) != 0.0) (1 / tan(radians)).toString() else "خطا"
            else -> "خطا"
        }
    } else {
        "ورودی نامعتبر"
    }
}

@Preview(showBackground = true)
@Composable
private fun te() {
    Calculator_App()
}