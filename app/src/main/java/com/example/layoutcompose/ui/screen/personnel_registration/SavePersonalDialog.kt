package com.example.layoutcompose.ui.screen.personnel_registration

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.core.graphics.toColor
import androidx.core.graphics.toColorLong
import com.example.layoutcompose.R

@Composable
fun SavePersonalDialog(
	onDismissRequest : () -> Unit ,
	onConfirmation : () -> Unit ,
	painter : Painter ,
	imageDescription : String ,
	items : PersonalModel
) {
	Dialog(onDismissRequest = { onDismissRequest() }) {
		// Draw a rectangle shape with rounded corners inside the dialog
		Card(
			modifier = Modifier
				.fillMaxWidth()
				.height(375.dp)
				.background(Color.Blue)
				.padding(16.dp) ,
			shape = RoundedCornerShape(16.dp) ,

		) {
			Column(
				modifier = Modifier
					.fillMaxSize() ,
				verticalArrangement = Arrangement.Center ,
				horizontalAlignment = Alignment.CenterHorizontally ,
			) {
				Image(
					painter = painter ,
					contentDescription = imageDescription ,
					contentScale = ContentScale.Fit ,

				)
				Spacer(modifier = Modifier.height(15.dp))
				Text(
					text = "This is a dialog with buttons and an image." ,
					modifier = Modifier.padding(16.dp) ,
				)
				Row(
					modifier = Modifier
						.fillMaxWidth() ,
					horizontalArrangement = Arrangement.Center ,
				) {
					TextButton(
						onClick = { onDismissRequest() } ,
						modifier = Modifier.padding(8.dp) ,
					) {
						Text("Dismiss")
					}
					TextButton(
						onClick = { onConfirmation() } ,
						modifier = Modifier.padding(8.dp) ,
					) {
						Text("Confirm")
					}
				}
			}
		}
	}
}

@Preview
@Composable
private fun test_preview() {
	SavePersonalDialog(
		onDismissRequest = { /*TODO*/ } ,
		onConfirmation = { /*TODO*/ } ,
		painter = painterResource(id = R.drawable.baseline_person_24) ,
		imageDescription = "personal" ,
		items = PersonalModel(
			1,
			"abtin",
			"atef",
			"09106999529",
			"abtinatef4@gmail.com",
			"tehran",
			"0441625241",
			12,
			"1255522055"
		),
	)
}


