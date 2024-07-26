package com.example.layoutcompose.ui.screen.sampleTextFilde

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SampleTextFilde(modifier: Modifier = Modifier) {
    var text by remember {
        mutableStateOf("")
    }

    TextField(
        modifier = modifier.padding(vertical = 7.dp, horizontal = 5.dp),
        value = text,
        onValueChange = { text = it },
        label = {
            Text(text = "label", color = Color.Red)
        },
        placeholder = {
            Text(text = "placeholder", color = Color.Blue)
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Info, contentDescription = "", tint = Color.Red)
        },
        trailingIcon = {
            Icon(imageVector = Icons.Default.Done, contentDescription = "", tint = Color.Blue)
        },
        isError = false,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        ),
    )
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = {
            Text(text = "label", color = Color.Red)
        },
        placeholder = {
            Text(text = "placeholder", color = Color.Blue)
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Info, contentDescription = "", tint = Color.Red)
        },
        trailingIcon = {
            Icon(imageVector = Icons.Default.Done, contentDescription = "", tint = Color.Blue)
        },
        isError = false,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        ),
        shape = RoundedCornerShape(20.dp)
    )
}

@Preview
@Composable
private fun SampleTextFildePreview() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        SampleTextFilde()
    }

}