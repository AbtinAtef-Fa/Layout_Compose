package com.example.layoutcompose.ui.screen.samplePractice.couter


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun main_Counter(modifier: Modifier = Modifier) {
    var content by remember {
        mutableStateOf(0)
    }
    var input by remember {
        mutableStateOf(0)
    }
//    Context =  LocalContext.current
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Count=> :  $content",
            fontWeight = FontWeight.W700
        )
        Spacer(modifier = modifier.height(40.dp))
        Row(
            modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            OutlinedButton(
                onClick = { content++ }
            ) {
                Text(text = "increment")
            }

            OutlinedButton(
                onClick = { content-- }
            ) {
                Text(text = "falling")
            }

            OutlinedButton(
                onClick = {
                    input = 0
                    content = 0
                }
            ) {
                Text(text = "reset")
            }

            OutlinedButton(
                onClick = {
                    content += input
                    input = 0
                }
            ) {
                Text(text = "ADD_new")
            }
        }

        Spacer(modifier = modifier.height(20.dp))

        Row(
            modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            OutlinedTextField(
                value = input.toString(),
                onValueChange = { input = it.toIntOrNull() ?: 0 },
                placeholder = { "enter the number" },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

            )
        }
    }
}

@Composable
fun Buttons_com(modifier: Modifier = Modifier) {

}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
private fun main_Counter_preview() {
    main_Counter()
}