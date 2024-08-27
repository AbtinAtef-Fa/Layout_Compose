package com.example.layoutcompose.ui.screen.sampleLazy

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("UnrememberedMutableState")
@Composable
fun SampleToDoText(modifier: Modifier = Modifier) {
    var text by remember {
        mutableStateOf("")
    }

    val list = remember {
        mutableStateListOf(text)
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(value = text, onValueChange = { text = it })
        Button(onClick = {
            if (text.isNotBlank())
                list.add(text)
            text = ""
        }) {
            Text(text = "click")
        }

        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .background(Color.Red),
        ) {
            items(list) {
                if (it.isNotBlank())
                    CardToDoList(data = it)
            }
        }
    }
}

@Composable
fun CardToDoList(modifier: Modifier = Modifier, data: String) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(horizontal = 3.dp, vertical = 4.dp)
            .background(Color.Red),
        colors = CardDefaults.cardColors(
            contentColor = Color.Green,
            containerColor = Color.Blue
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,

            ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    modifier = Modifier.padding(4.dp),
                    imageVector = Icons.Default.Call,
                    contentDescription = "info"
                )
                Text(
                    modifier = Modifier.padding(4.dp),
                    text = data
                )
            }
        }
    }
}

@Preview
@Composable
private fun SampleToDoTextPreview() {
    SampleToDoText()
}