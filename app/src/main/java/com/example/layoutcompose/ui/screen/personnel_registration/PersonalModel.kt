package com.example.layoutcompose.ui.screen.personnel_registration

data class PersonalModel(
	val id : Int,
	val name:String,
	val family:String,
	val phone:String,
	val email:String,
	val address:String,
	val nationalCode:String,
//	new data for personality age and bank
	val age : Int,
	val bankdnumber :String,
)
