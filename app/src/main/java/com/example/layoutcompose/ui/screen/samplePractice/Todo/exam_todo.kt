package com.example.layoutcompose.ui.screen.samplePractice.Todo
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
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
@Composable
fun Todo_nameSen(modifier : Modifier = Modifier) {
	var name by remember { mutableStateOf("") }
	var sen by remember { mutableStateOf(0) }

	val List_name = remember { mutableStateListOf<Pair<String , Int>>() }

	Column(
		modifier = modifier
			.fillMaxSize() ,
		verticalArrangement = Arrangement.Center ,
		horizontalAlignment = Alignment.CenterHorizontally
	) {

		Row {
			OutlinedTextField(
				modifier = Modifier
					.weight(1f)
					.padding(vertical = 12.dp , horizontal = 11.dp) ,
				value = name ,
				onValueChange = { name = it } ,
				label = { Text("name🧑🏻‍🦲") } ,
			)
			OutlinedTextField(
				modifier = Modifier
					.weight(1f)
					.padding(vertical = 12.dp , horizontal = 11.dp) ,
				value = sen.toString() ,
				onValueChange = { sen = it.toIntOrNull() ?: 0 } ,
				label = { Text("sen🔢") } ,
				keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
			)
		}
		ElevatedButton(
			onClick = {
				List_name.add(name to sen)
				name = ""
				sen = 0
			} ,
		) {
			Text("submit")
		}
		LazyColumn {
			items(List_name) { (personName , personAge) ->
				Card_nameSen(
					name = personName ,
					sen = personAge
				)
			}
		}
	}
}

@Composable
fun Card_nameSen(
	name : String ,
	sen : Int
) {
	ElevatedCard(
		modifier = Modifier
			.padding(vertical = 4.dp , horizontal = 5.dp)
			.fillMaxSize() ,
		shape = CardDefaults.elevatedShape ,
		colors = CardDefaults.cardColors(
			contentColor = Color.Black ,
			containerColor = Color.White
		)
	) {
		Row(
			horizontalArrangement = Arrangement.Center
		) {
			Text(
				name
			)
			Spacer(modifier = Modifier.weight(1f))
			Text("$sen")

			Icon(
				imageVector = Icons.Filled.Done ,
				contentDescription = "Info"
			)
		}
	}
}

/**
 *end
 * 䑕
 * 甹
 * 碕
 * 袈
 * 衸
 * 硸
 * THE END FOR CALCULATOR 169
 * @author: ABTIN ATEF  -> GITHUB=> AbtinAtef_Fa
 *  114 - >the end cal todo sen Todo->🛑🛑🛑🛑🛑🛑🛑🛑🛑🔚🔚🔚🔚🔚
 *  @since :abtin atef fa
 */
@Preview(showBackground = true)
@Composable
private fun tt() {
	Todo_nameSen()
}