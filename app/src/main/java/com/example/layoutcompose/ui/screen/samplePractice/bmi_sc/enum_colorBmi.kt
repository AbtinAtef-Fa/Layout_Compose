package com.example.layoutcompose.ui.screen.samplePractice.bmi_sc

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.example.layoutcompose.R
import com.example.layoutcompose.ui.theme.Blue

enum class enum_colorBmi(val color : Color) {
	NORMAL(Color.Green), // عادی
	Underweight(Color.Blue),             //کمبود وزن
	Obese(Color.Red), // چاق
	Overweight(Color.DarkGray) // اضافه وزن
}