package com.example.layoutcompose.ui.screen.samplePractice.exam

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun RunMainExam(modifier: Modifier = Modifier) {
    var score by remember {
        mutableStateOf("")
    }

    var nameBook by remember {
        mutableStateOf("")
    }

    var listS by remember {
        mutableStateOf(listOf<Pair<String, Float>>())
    }

    var resault_avrage by remember {
        mutableFloatStateOf(0f)
    }

    var errormessage by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            OutlinedTextField(
                modifier = modifier
                    .weight(1f)
                    .padding(11.dp),
                value = score,
                onValueChange = { score = it },
                label = { Text("score") },
                leadingIcon = {
                    Icon(
                        modifier = modifier.clickable {
                            score = ""
                        },
                        imageVector = Icons.Default.DeleteOutline,
                        contentDescription = null,
                        tint = Color.Red
                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                )
            )

            OutlinedTextField(

                modifier = modifier
                    .weight(1f)
                    .padding(11.dp),
                value = nameBook,
                onValueChange = { nameBook = it },
                leadingIcon = {
                    Icon(
                        modifier = modifier.clickable { nameBook = "" },
                        imageVector = Icons.Default.DeleteOutline,
                        tint = Color.Red,
                        contentDescription = null
                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                ),
                label = {
                    Text("NameBook")
                })
        }

        Row {
            ElevatedButton(
                onClick = {
                    val scoreValue = score.toFloatOrNull()
                    if (scoreValue != null && nameBook.isNotEmpty()) {
                        if (scoreValue in 0f..20f) {
                            listS = listS + Pair(nameBook, scoreValue)
                            score = ""
                            nameBook = ""
                            errormessage = ""
                        } else {
                            errormessage = "is grade to 0 in 20"
                        }
                    } else {
                        errormessage = "please grade and name book"
                    }
                },
            ) {
                Text("addList")
            }

            ElevatedButton(
                onClick = {
                    if (listS.isNotEmpty()) {
                        resault_avrage = listS.map { it.second }
                            .average()
                            .toFloat()
                    }
                }
            ) {
                Text("total")
            }

            ElevatedButton(
                onClick = {
                    resault_avrage = 0.0f
                    nameBook = ""
                    score = ""
                    listS = emptyList()
                    errormessage = ""
                }
            ) {
                Text("reset")
            }
        }

        Column {
            if (errormessage.isNotEmpty()) {
                Text(errormessage, color = Color.Red)
            }
        }

        Column {
            LazyColumn {
                items(listS) { (score, name) ->
                    Text(
                        "$name : $score", color = Color.Green
                    )
                }
            }
        }
        Text("average: $resault_avrage ")

    }
}