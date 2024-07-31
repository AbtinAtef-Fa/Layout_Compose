package com.example.layoutcompose.ui.screen.samplePractice.calculatour

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CalculatorApp() {
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = num1,
            onValueChange = { num1 = it },
            label = { Text("عدد اول") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = num2,
            onValueChange = { num2 = it },
            label = { Text("عدد دوم") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(onClick = {
                result = calculate(num1, num2, "+")
            }) { Text("+") }
            Button(onClick = {
                result = calculate(num1, num2, "-")
            }) { Text("-") }
            Button(onClick = {
                result = calculate(num1, num2, "*")
            }) { Text("*") }
            Button(onClick = {
                result = calculate(num1, num2, "/")
            }) { Text("/") }
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "نتیجه: $result")
    }
}

fun calculate(num1: String, num2: String, operator: String): String {
    val number1 = num1.toDoubleOrNull()
    val number2 = num2.toDoubleOrNull()
    return if (number1 != null && number2 != null) {
        when (operator) {
            "+" -> (number1 + number2).toString()
            "-" -> (number1 - number2).toString()
            "*" -> (number1 * number2).toString()
            "/" -> if (number2 != 0.0) (number1 / number2).toString() else "خطا"
            else -> "خطا"
        }
    } else {
        "ورودی نامعتبر"
    }
}
@Preview(showBackground = true)
@Composable
private fun test () {
    MaterialTheme {
        CalculatorApp()
    }
}
