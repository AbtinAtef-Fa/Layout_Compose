package com.example.layoutcompose.ui.screen.samplePractice.bmi_sc

data class bmi_data_class(
	val enumColorbmi : enum_colorBmi= enum_colorBmi.Underweight,
	val weight:String = "",
	val heigth:String= "",
	val BMI: Float= 0f,
	val lowerWeightBound:Float = 0f,
	val higherWeightBound:Float = 0f

)
