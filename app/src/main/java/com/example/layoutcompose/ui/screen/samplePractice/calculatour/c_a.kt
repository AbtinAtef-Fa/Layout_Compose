package com.example.layoutcompose.ui.screen.samplePractice.calculatour

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutcompose.R

/**
 *start
 *
 * 䑕
 * 甹
 * 碕
 * 袈
 * 衸
 * 硸
 * 碔

 * THE END FOR CALCULATOR 169
 *
 * @author: ABTIN ATEF  -> GITHUB=> AbtinAtef_Fa
 *  169 - >the end cal culator->🛑🛑🛑🛑🛑🛑🛑🛑🛑🔚🔚🔚🔚🔚
 *  @see com.example.layoutcompose.ui.screen.samplePractice.calculatour.calcu
 * 🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚
 *  @since :abtin atef fa
 */

@Composable
fun ScCaL(modifier : Modifier = Modifier) {

	var number1 by remember {
		mutableStateOf("")
	}

	var number2 by remember {
		mutableStateOf("")
	}

	var res by remember {
		mutableStateOf("")
	}

	var operations by remember {
		mutableStateOf("")
	}

	Column(
		modifier = modifier.fillMaxSize() ,
		horizontalAlignment = Alignment.CenterHorizontally ,
		verticalArrangement = Arrangement.Center
	) {
		Icon(
			painter = painterResource(R.drawable.rounded_calculate_24) ,
			contentDescription = "calculator" ,
		)
//		Text("calculator" , color = Color.Green)
		Row(
			modifier.fillMaxWidth()
		) {
			OutlinedTextField(modifier = modifier
				.weight(1f)
				.padding(12.dp) ,
//                    .blur(0.5.dp)
                              value = number1 ,
                              onValueChange = { number1 = it } ,
                              label = { Text("number1") } ,
                              keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number) ,
                              leadingIcon = {
	                              Icon(
		                              imageVector = Icons.Filled.Favorite ,
		                              contentDescription = "number1" ,
		                              tint = Color.Red
	                              )
                              } ,
                              shape = RoundedCornerShape(70.dp))
			OutlinedTextField(modifier = modifier
				.weight(1f)
//                    .blur(0.5.dp)
				.padding(12.dp) ,
			                  value = number2 ,
			                  leadingIcon = {
				                  Icon(
					                  imageVector = Icons.Rounded.AddCircle ,
					                  contentDescription = "number2" ,
					                  tint = Color.Yellow
				                  )
			                  } ,
			                  shape = RoundedCornerShape(30.dp) ,
			                  onValueChange = { number2 = it } ,
			                  label = { Text("number2") })
		}

		Column {
			Row {
				ElevatedButton(onClick = {
					operations = "+";res = calcu(number1 , number2 , operations)
				}) {
					Text(text = "➕")
				}
				ElevatedButton(onClick = {
					operations = "-"; res = calcu(number1 , number2 , operations)
				}) {
					Text(text = "➖")
				}
				ElevatedButton(onClick = {
					operations = "/"; res = calcu(number1 , number2 , operations)
				}) {
					Text(text = "➗")
				}

				ElevatedButton(onClick = {
					operations = "*"; res = calcu(number1 , number2 , operations)
				}) {
					Text(text = "✖")
				}

				ElevatedButton(onClick = {
					operations = "^"; res = calcu(number1 , number2 , operations)
				}) {
					Text(text = "✖️✖️")
				}

				ElevatedButton(onClick = {
					operations = "%"; res = calcu(number1 , number2 , operations)
				}) {
					Text(text = "%")
				}
			}
		}
		Column {
			Text(text = "res⁉️➡️➡️$res")
		}
	}
}

fun calcu(
	num1 : String ,
	num2 : String ,
	operation : String
) : String {
	val n1 = num1.toDoubleOrNull() ?: return "🛑🛑🛑🛑🛑1️⃣"
	val n2 = num2.toDoubleOrNull() ?: return "🛑🛑🛑🛑🛑2️⃣"
	return when (operation) {
		"+" -> (n1 + n2).toString()
		"-" -> (n1 - n2).toString()
		"*" -> (n1 * n2).toString()
		"/" -> if (n2 != 0.0) (n1 / n2).toString() else "🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑"
		"^" -> Math.pow(n1 , n2).toString()
		"%" -> (n1 * n2 / 100).toString()
		else -> "💀💀💀💀"
	}
}
/**
 * end
 */
@Preview(showBackground = true)
@Composable
private fun tt() {
	ScCaL()
}