package com.example.layoutcompose.ui.screen.personnel_registration

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

@Composable
fun PersonalCardItem(
	modifier : Modifier = Modifier,
	item : PersonalModel
) {
	CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
		ElevatedCard(
			elevation = CardDefaults.cardElevation(
				defaultElevation = 6.dp,

			) ,
			modifier = Modifier
				.padding(horizontal = 3.dp , vertical = 3.dp)
				.fillMaxWidth()
				.height(80.dp) ,

			) {
			Column(
				modifier = Modifier
					.padding(horizontal = 4.dp)
					.fillMaxSize() ,
				verticalArrangement = Arrangement.SpaceAround
			) {
				Row(
					modifier = Modifier
						.fillMaxWidth() ,
					horizontalArrangement = Arrangement.SpaceAround
				) {
					TextItemPersonal(text = "نام:" , data = item.name)
					TextItemPersonal(text = "نام خانوادگی:", data = item.family)
					TextItemPersonal(text = "تلفن:", data = item.phone)
				}

				Row(
					modifier = Modifier
						.fillMaxWidth() ,
					horizontalArrangement = Arrangement.SpaceAround
				) {
					TextItemPersonal(text = "آدرس:" , data =item.address)
					TextItemPersonal(text = "ایمیل:", data = item.email)
				}

				Row (
					modifier = Modifier
						.fillMaxWidth(),
					horizontalArrangement = Arrangement.SpaceAround
				){
					TextItemPersonal(text = "code personality:", data = item.nationalCode)
					TextItemPersonal(text = "age:", data = item.age.toString())
					TextItemPersonal(text = "bankedId:", data = item.bankdnumber.toString())
				}

			}
		}
	}

}


@Composable
fun TextItemPersonal(
	modifier : Modifier = Modifier ,
	text : String ,
	data : String = " "
) {
	Text(text = text + " " + data)
}

@Preview
@Composable
private fun PersonalCardItemPreview() {
	PersonalCardItem(
		item=PersonalModel(1, "علی", "احمدی", "09123456789", "ali@example.com", "تهران","124588999",13,5022532147),
	)
}