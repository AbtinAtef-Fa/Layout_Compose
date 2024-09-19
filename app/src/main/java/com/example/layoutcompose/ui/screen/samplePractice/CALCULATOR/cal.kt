package com.example.layoutcompose.ui.screen.samplePractice.CALCULATOR

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MainCal(modifier: Modifier = Modifier) {
    var num1 by remember {
        mutableStateOf("")
    }

    var num2 by remember {
        mutableStateOf("")
    }

    var result by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            TextField(
                modifier = modifier
                    .weight(1f)
                    .padding(11.dp),
                value = num1,
                onValueChange = { num1 = it },
                label = { Text("number1") },
                leadingIcon = {
                    Icon(
                        modifier = modifier.clickable { num1 = "" },
                        imageVector = Icons.Default.DeleteOutline,
                        contentDescription = null,
                        tint = Color.Red
                    )
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            TextField(
                modifier = modifier
                    .weight(1f)
                    .padding(11.dp),
                value = num2,
                onValueChange = { num2 = it },
                label = {
                    Text("number2")
                },
                leadingIcon = {
                    Icon(
                        modifier = Modifier.clickable { num2 = "" },
                        imageVector = Icons.Default.Cancel,
                        tint = Color.Red,
                        contentDescription = null
                    )
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
        }
        Row {
            ElevatedButton(onClick = {
                result = cp(num1, num2, "+")
            }) {
                Text("+", textAlign = TextAlign.Center)
            }
            ElevatedButton(onClick = {
                result = cp(num1, num2, "-")
            }) {
                Text("-")
            }
            ElevatedButton(onClick = {
                result = cp(num1, num2, "*")
            }) {
                Text("*")
            }
            ElevatedButton(onClick = {
                result = cp(num1, num2, "/")
            }) {
                Text("/")
            }
        }
        Text(
            result, color = Color.Red
        )
    }
}

fun cp(number1: String, number2: String, operation: String): String {
    val n1 = number1.toLongOrNull() ?: return " \u1552"
    val n2 = number2.toLongOrNull() ?: return " \u1528"

    return when {
        n1 == null || n2 == null -> "Please enter valid numbers"
        operation == "+" -> (n1 + n2).toString()
        operation == "-" -> (n1 - n2).toString()
        operation == "*" -> (n1 * n2).toString()
        operation == "/" -> if (n2 != 0L) {
            (n1 / n2).toString()
        } else {
            "Cannot divide by zero"
        }

        else -> "Unknown operation"
    }
}
