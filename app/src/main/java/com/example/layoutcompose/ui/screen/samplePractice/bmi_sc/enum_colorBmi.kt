package com.example.layoutcompose.ui.screen.samplePractice.bmi_sc

import androidx.compose.ui.graphics.Color

enum class enum_colorBmi(val color : Color) {
	NORMAL(Color.Green), // عادی
	Underweight(Color.Blue),             //کمبود وزن
	Obese(Color.Red), // چاق
	Overweight(Color.DarkGray) // اضافه وزن
}