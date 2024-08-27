package com.example.layoutcompose.ui.screen.personnel_registration

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PersonnelRegistration(modifier : Modifier = Modifier) {
	// ایجاد لیست نمونه‌ها
	val personalList = listOf(
		PersonalModel(1, "علی", "احمدی", "09123456789", "ali@example.com", "تهران","0441625245",12,"502266998"),
		PersonalModel(2, "مریم", "محمدی", "09198765432", "maryam@example.com", "اصفهان","001255689",51,"450221369"),
		PersonalModel(3, "حسین", "رضایی", "09123456700", "hosein@example.com", "شیراز","154786922",32,"555555"),
		PersonalModel(4, "آبتین", "عاطف", "09106999529", "abtin@example.com", "karaj","0441625241",17,"5022175869"),
	)
	Scaffold(
		modifier = modifier,
		topBar = {
			TopBar()
		},
		floatingActionButton = {
			FloatingActionPersonal(
				onClick = {}
			)
		}

	) { p ->
		Column(
			modifier = Modifier
				.padding(p)
				.fillMaxSize()
		) {
			LazyColumn {
				items(personalList){ item->
					PersonalCardItem(item = item)
				}
			}
		}

	}

}

@Preview
@Composable
private fun PersonnelRegistrationPreview() {
	PersonnelRegistration()
}


