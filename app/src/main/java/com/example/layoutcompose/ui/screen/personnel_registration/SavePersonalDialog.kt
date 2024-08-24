package com.example.layoutcompose.ui.screen.personnel_registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.layoutcompose.R

@Composable
fun SavePersonalDialog(
	onDismissRequest : () -> Unit ,
	onConfirmation : () -> Unit ,

	imageDescription : String ,
	items : PersonalModel
) {
	Dialog(onDismissRequest = { onDismissRequest() }) {

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
					.fillMaxSize()
					.background(colorResource(id = R.color.blue_holo)) ,
				verticalArrangement = Arrangement.Center ,
				horizontalAlignment = Alignment.CenterHorizontally ,
			) {
				Icon(
					modifier = Modifier
						.width(40.dp)
						.height(40.dp) ,
					imageVector = Icons.Default.AccountCircle ,
					contentDescription = imageDescription ,
				)
				Spacer(modifier = Modifier.width(11.dp))
				Text(
					text = "save Dialog" ,
					color = Color.Black ,
					fontSize = 20.sp
				)
				Column(
//					modifier = Modifier
//						.background(colorResource(id = R.color.white)),
					
					verticalArrangement = Arrangement.Center,
					horizontalAlignment = Alignment.CenterHorizontally
				) {

					TextItemPersonal(text = "name: " , data = items.name)
					TextItemPersonal(text = "family: " , data = items.family)
					TextItemPersonal(text = "phone: " , data = items.phone)
					TextItemPersonal(text = "email: " , data = items.email)
					TextItemPersonal(text = "address: " , data = items.address)
					TextItemPersonal(text = "nationalCode: " , data = items.nationalCode)
					TextItemPersonal(text = "age: " , data = items.age.toString())
					TextItemPersonal(text = "bank: " , data = items.bankdnumber)
				}
				Text(
					text = " save database " ,
					color = Color.Black ,
				)
				Row(
					modifier = Modifier.fillMaxWidth() ,
					horizontalArrangement = Arrangement.Center ,
				) {
					TextButton(
						onClick = { onDismissRequest() } ,
						modifier = Modifier.padding(8.dp) ,
					) {
						Text(
							"Dismiss" , color = Color.Black
						)
					}
					TextButton(
						onClick = { onConfirmation() } ,
						modifier = Modifier.padding(8.dp) ,
					) {
						Text(
							"Confirm" , color = Color.Black
						)
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

		imageDescription = "personal" ,
		items = PersonalModel(
			1 ,
			"abtin" ,
			"atef" ,
			"09106999529" ,
			"abtinatef4@gmail.com" ,
			"tehran" ,
			"0441625241" ,
			12 ,
			"1255522055"
		) ,
	)
}