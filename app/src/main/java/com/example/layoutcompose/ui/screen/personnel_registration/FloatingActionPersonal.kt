package com.example.layoutcompose.ui.screen.personnel_registration

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.layoutcompose.ui.screen.samplePractice.calculatour.calcu

@Composable
fun FloatingActionPersonal(
	modifier : Modifier = Modifier ,
	onClick : () -> Unit
) {

	ElevatedButton(
		onClick = {
		onClick
	}) {
		Text(text = "➕")
		Spacer(modifier = modifier.width(2.dp))
		Text(text = "ثبت جدید")
	}

}