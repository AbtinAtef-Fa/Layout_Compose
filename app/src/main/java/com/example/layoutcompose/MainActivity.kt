package com.example.layoutcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.layoutcompose.ui.screen.personnel_registration.ui.PersonnelRegistration
import com.example.layoutcompose.ui.theme.LayoutComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutComposeTheme {

                PersonnelRegistration()

            }
        }
    }
}