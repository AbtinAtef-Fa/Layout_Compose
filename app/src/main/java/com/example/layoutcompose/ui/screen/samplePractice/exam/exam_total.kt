import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
 *  148 - >the end todo exam carnameh->🛑🛑🛑🛑🛑🛑🛑🛑🛑🔚🔚🔚🔚🔚
 * 🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚🔚
 *  @since :abtin atef fa
 */
@Composable
fun MyApp_exam() {
	// State variables
	var score by remember { mutableStateOf("") }
	var namebook by remember { mutableStateOf("") }
	var listScore by remember { mutableStateOf(listOf<Pair<String , Float>>()) }
	var totalScore by remember { mutableStateOf(0f) }

	Column(
		modifier = Modifier
			.background(Color.White)
			.fillMaxSize() ,
		verticalArrangement = Arrangement.Center ,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Text(
			text = "Score Total" ,
			fontSize = 23.sp ,
			fontStyle = FontStyle.Italic ,
			softWrap = true
		)

		Row {
			TextField(
				modifier = Modifier
					.weight(1f)
					.padding(12.dp) ,
				value = namebook ,
				onValueChange = { namebook = it } ,
				label = { Text(text = "Name Book") }
			)
			TextField(
				modifier = Modifier
					.weight(1f)
					.padding(12.dp) ,
				value = score ,
				onValueChange = { score = it } ,
				keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number) ,
				label = { Text(text = "Score") }
			)
		}

		Row {
			ElevatedButton(
				modifier = Modifier.padding(12.dp) ,
				onClick = {
					if (score.isNotBlank() && namebook.isNotBlank()) {
						// Add the score to the list
						listScore = listScore + Pair(namebook , score.toFloat())
						// Clear input fields
						score = ""
						namebook = ""
					}
				}
			) {
				Text(
					text = "Add Score" ,
					fontSize = 23.sp ,
					fontStyle = FontStyle.Italic ,
					softWrap = true
				)
			}
			OutlinedButton(
				modifier = Modifier.padding(12.dp) ,
				onClick = {
					// Calculate total score
					totalScore = 0f
					for (entry in listScore) {
						totalScore += entry.second
					}

					// Calculate average score
					totalScore = if (listScore.isNotEmpty()) totalScore / listScore.size else 0f
				}
			) {
				Text(
					text = "total" ,
					fontSize = 23.sp ,
					fontStyle = FontStyle.Italic ,
					softWrap = true
				)
			}
		}
		// Display total and average scores
		Text(
			text = "Total Score: $totalScore" ,
			fontSize = 23.sp ,
			fontStyle = FontStyle.Italic ,
			softWrap = true
		)
		// Display the list of scores
		LazyColumn {
			items(listScore) { (name , score) ->
				Text(
					text = "$name: $score" ,
					fontSize = 23.sp ,
					fontStyle = FontStyle.Italic ,
					softWrap = true
				)
			}
		}
	}
}