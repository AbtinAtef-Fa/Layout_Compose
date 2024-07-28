package com.example.layoutcompose.ui.screen.samplePractice.Bmi


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Body_TextFiled(modifier: Modifier = Modifier) {
    var h by remember {
        mutableStateOf("")
    }
    var w by remember {
        mutableStateOf("")
    }
    var classification by remember {
        mutableStateOf("")
    }
    var calculation by remember {
        mutableStateOf(0.0f)
    }
    var progression by remember {
        mutableStateOf(0.0f)
    }
    var classiColor by remember {
        mutableStateOf(Color.White)
    }

    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "BMI _ PROGRESS _ CALCULATOR",
            color = Color.Cyan,
            fontSize = 42.sp,
            fontWeight = FontWeight.Thin
        )

        Text(
            text = " __M__ ",
            color = Color.White,
            fontSize = 21.sp,
            fontWeight = FontWeight.Normal
        )
        Text_Filed_bmi(
            inputValue = h,
            metric = "cm",
            label = "Height",
            onValueChange = {
                h = it
                if (h.isEmpty() || w.isEmpty()) {
                    classification = ""
                    calculation = 0f
                    progression = 0f
                } else {
                    calculation = com_BMI(h, w)
                    calculation = com_BMI(h, w)
                    classification = BMI(calculation)
                    progression = getProgresses(calculation)
                    classiColor = Color_Classi(calculation)
                }
            }
        )
        Text_Filed_bmi(
            inputValue = w,
            metric = "kg",
            label = "Weigth",
            onValueChange = {
                w = it
                if (h.isEmpty() || w.isEmpty()) {
                    classification = ""
                    calculation = 0f
                    progression = 0f
                } else {
                    calculation = com_BMI(h, w)
                    classification = BMI(calculation)
                    progression = getProgresses(calculation)
                    classiColor = Color_Classi(calculation)
                }
            }
        )
        Box(
            modifier = modifier
                .padding(vertical = 16.dp),
            contentAlignment = Center
        ) {
            Text(
                text = classification,
                color = classiColor,
                fontSize = 23.sp,
                fontWeight = FontWeight.Medium
            )
        }
        Box(
            modifier = modifier
                .padding(horizontal = 16.dp, vertical = 64.dp)
                .size(230.dp),
            contentAlignment = Center
        ) {
            Text(
                text = String.format("%.2f", calculation),
                color = Color.White,
                fontSize = 64.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Thin,
            )
            CircularProgressIndicator(
                progress = progression,
                color = classiColor,
                strokeWidth = 19.dp,
                modifier = modifier
                    .fillMaxSize()
            )
        }
    }
}