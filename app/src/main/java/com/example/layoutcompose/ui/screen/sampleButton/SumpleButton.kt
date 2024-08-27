package com.example.layoutcompose.ui.screen.sampleButton

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledIconToggleButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SumpleButton(modifier: Modifier = Modifier) {
    var checked by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = modifier
            .background(Color.White)
    ) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Ok")
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "sddd",
                tint = Color.White
            )
        }

        ElevatedButton(onClick = { /*TODO*/ }) {
            Text(text = "Ok")
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "sddd",
                tint = Color.White
            )
        }
        FilledIconButton(onClick = { /*TODO*/ }) {
            Row {
                Text(text = "Ok")
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "sddd",
                    tint = Color.White
                )
            }

        }

        FilledIconToggleButton(checked = checked, onCheckedChange = { checked = it }) {
            Row {
                Text(text = "Ok")
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "sddd",
                    tint = Color.White
                )
            }
        }

        IconButton(onClick = { /*TODO*/ }) {
            Row {
                Text(text = "Ok")
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "sddd",
                    tint = Color.Black
                )
            }
        }

        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.White
            ),
            border = BorderStroke(color = Color.Red, width = 2.dp)
        ) {
            Row {
                Text(text = "Ok")
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "sddd",
                    tint = Color.Black
                )
            }
        }


    }
}


@Composable
fun SumpleButtonClick(modifier: Modifier = Modifier) {
    var check by remember {
        mutableIntStateOf(0)
    }
    Column {
        Button(onClick = { check++ }) {
            Text(text = "salam $check")
        }
    }

}

@Preview
@Composable
private fun SumpleButtonPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        //  SumpleButton()
        SumpleButtonClick()
    }
}