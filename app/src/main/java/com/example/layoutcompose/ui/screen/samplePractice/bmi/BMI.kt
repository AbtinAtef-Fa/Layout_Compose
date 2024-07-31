import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BMICalculatorScreen() {
    var weightInput by remember { mutableStateOf(TextFieldValue("")) }
    var heightInput by remember { mutableStateOf(TextFieldValue("")) }
    var result by remember { mutableStateOf("") }
    val bmiRecords = remember { mutableStateListOf<Pair<String, String>>() }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "BMI Calculator", fontSize = 24.sp, modifier = Modifier.padding(bottom = 16.dp))

        TextField(
            value = weightInput,
            onValueChange = { weightInput = it },
            label = {Text(text = "وزن", fontWeight = FontWeight.Bold)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            singleLine = true,

        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = heightInput,
            label = { Text(text = "ارتفاع", fontWeight = FontWeight.Bold) },

            onValueChange = { heightInput = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            singleLine = true,

        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            result = calculateBMI(weightInput.text, heightInput.text)
            if (result != "Invalid Input") {
                bmiRecords.add(Pair("${weightInput.text}kg, ${heightInput.text}m", result))
            }
        }) {
            Text(text = "Calculate BMI")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Result: $result", style = MaterialTheme.typography.bodyLarge)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "BMI Records", fontSize = 20.sp, modifier = Modifier.padding(bottom = 8.dp))

        bmiRecords.forEach { record ->
            Text(text = "Weight & Height: ${record.first}, BMI: ${record.second}")
        }
    }
}

fun calculateBMI(weight: String, height: String): String {
    return try {
        val weightValue = weight.toDouble()
        val heightValue = height.toDouble()
        val bmi = weightValue / (heightValue * heightValue)
        String.format("%.2f", bmi)
    } catch (e: NumberFormatException) {
        "Invalid Input"
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBMICalculatorScreen() {
    Column {
        BMICalculatorScreen()
    }
}
