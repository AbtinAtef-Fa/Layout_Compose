package com.example.layoutcompose.ui.screen.samplePractice.bmi_sc

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.math.RoundingMode
import java.text.DecimalFormat

@Composable
fun RunningBMI_APK(
    modifier : Modifier = Modifier,
    mainviewmodelBmi : MainViewModel_BMI
) {
    val state = mainviewmodelBmi.state
    val weight = state.weight
    val height = state.heigth
    val bmi = state.BMI

    val context = LocalContext.current
    val category = state.enumColorbmi
    val df = DecimalFormat("#.#")
    df.roundingMode = RoundingMode.CEILING
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White) ,
        horizontalAlignment = Alignment.CenterHorizontally ,
    ) {
        Box(Modifier.padding(vertical = 16.dp) , contentAlignment = Alignment.Center) {
            Text(
                text = "Calculate BMI" ,
                fontSize = 28.sp ,
                fontWeight = FontWeight.Medium
            )
        }
        Divider(modifier = Modifier.fillMaxWidth())
        Row(
            verticalAlignment = Alignment.Bottom
        ) {


            OutlinedTextField(
                value = height ,
                onValueChange = {
                    if (state.heigth.isBlank() && it == ".") {
                        Toast.makeText(
                            context , "Error" , Toast.LENGTH_LONG
                        ).show()
                    } else
                        mainviewmodelBmi.cH(it)
                } ,
                textStyle = TextStyle(
                    fontSize = 14.sp ,

                    fontWeight = FontWeight.Bold
                ) ,
                label = {
                    Text(
                        "Height" ,
                    )
                } ,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number) ,

                )
            Spacer(
                modifier = Modifier.width(6.dp)
            )
            Text(
                text = "cm" ,
                fontSize = 14.sp ,

                fontWeight = FontWeight.Light
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Row(verticalAlignment = Alignment.Bottom) {
            OutlinedTextField(
                value = weight ,
                onValueChange = {
                    if (state.weight.isBlank() && it == ".") {
                        Toast.makeText(
                            context , "Error" , Toast.LENGTH_LONG
                        ).show()
                    } else
                        mainviewmodelBmi.cW(it)
                } ,
                textStyle = TextStyle(
                    fontSize = 14.sp ,

                    fontWeight = FontWeight.Bold
                ) ,
                label = {
                    Text(
                        "Weight" ,
                    )
                } ,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number) ,

                )
            Spacer(
                modifier = Modifier.width(6.dp)
            )
            Text(
                text = "kg" ,
                fontSize = 14.sp ,

                fontWeight = FontWeight.Light
            )
        }


        Spacer(modifier = Modifier.height(32.dp))
        Box(contentAlignment = Alignment.Center) {
            Text(
                text = category.name ,
                color = category.color ,
                fontSize = 24.sp ,
                fontWeight = FontWeight.Medium
            )
        }

        // Circular Progress bar with text in the center Custom Box
        Box(
            modifier = Modifier
                .padding(horizontal = 30.dp , vertical = 30.dp)
                .size(200.dp) ,
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = if (bmi > 100) ">100" else df.format(bmi.toBigDecimal()) ,

                fontSize = 48.sp ,
                textAlign = TextAlign.Center ,
                fontWeight = FontWeight.Medium ,
            )
            CircularProgressIndicator(
                progress = getProgress(bmi) ,
                color = category.color ,
                strokeWidth = 16.dp ,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight() ,
            )
        }

    }
}

fun getProgress(
    bmi : Float
) : Float {
    var progress = 0f
    if (bmi == 0f) {
        progress = 0f
    } else if (bmi < 18.5) {
        progress = .1f
    } else if (bmi >= 18.5 && bmi < 24.9) {
        progress = .5f
    } else if (bmi >= 24.9 && bmi < 30) {
        progress = .25f
    } else if (bmi >= 30 && bmi < 34.9) {
        progress = .75f
    } else if (bmi >= 40)
        progress = 1f
    return progress
}