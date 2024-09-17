package com.example.layoutcompose.ui.screen.personnel_registration

data class PersonalModel(
	val id : Int = 0,
	val name:String = "",
	val family:String = "",
	val phone:String= "",
	val email:String= "",
	val address:String = "",
	val nationalCode:String= "",
//	new data for personality age and bank
	val age : Int = 0,
	val bankdnumber :String ="",
)
