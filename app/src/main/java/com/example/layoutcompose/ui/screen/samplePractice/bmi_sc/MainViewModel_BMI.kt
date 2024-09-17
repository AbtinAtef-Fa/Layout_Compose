package com.example.layoutcompose.ui.screen.samplePractice.bmi_sc

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel_BMI : ViewModel() {
	var state by mutableStateOf(bmi_data_class())
	private fun calculateBmi(){
		state = if(state.heigth.isNotBlank() && state.weight.isNotBlank()) {
			val heightInMeters = state.heigth.toFloat() / 100
			val newBmi = state.weight.toFloat() / (heightInMeters * heightInMeters)
			calculateWeightBounds()
			val cat = findCategory(newBmi)
			state.copy(
				BMI = newBmi,
				enumColorbmi = cat
			)
		}else{
			state.copy(
				BMI = 0f,
				lowerWeightBound = 0f,
				higherWeightBound = 0f,
				enumColorbmi = enum_colorBmi.Underweight
			)
		}

	}
	private fun calculateWeightBounds(){
		val heightInMeters = state.heigth.toFloat()/100f
		val lWeight = 18.6f*(heightInMeters*heightInMeters)
		val hWeight = 24.9f*(heightInMeters*heightInMeters)
		state = state.copy(
			lowerWeightBound = lWeight,
			higherWeightBound = hWeight
		)
	}

	private fun findCategory(bmi:Float):enum_colorBmi{
		return if (bmi<=18.5){
			enum_colorBmi.Underweight
		}else if (bmi<=24.9){
			enum_colorBmi.NORMAL
		}else if(bmi<=29.9){
			enum_colorBmi.Overweight
		}else {
			enum_colorBmi.Obese
		}
	}
	fun cW(w:String){
		state = state.copy(
			weight = w
		)
		calculateBmi()
	}
	fun cH(h: String){
		state = state.copy(
			heigth = h
		)
		calculateBmi()
	}
}