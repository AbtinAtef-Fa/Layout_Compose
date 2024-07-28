package com.example.layoutcompose.ui.screen.samplePractice.Bmi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import com.example.layoutcompose.ui.theme.Blue
import com.example.layoutcompose.ui.theme.Red
import kotlin.math.pow


fun BMI(c: Float): String {
    var classi = ""
    if (c < 18.5) {
        classi = "لاغر"
    } else if (c >= 18.5 && c < 24.9) {
        classi = "سالم"
    } else if (c >= 24.9 && c < 30) {
        classi = "Overweight"
    } else if (c >= 30) {
        classi = "Suffering from Obesity"
    }
    return classi
}

fun getProgresses(c: Float): Float {
    var p = 0.0f
    if (c < 18.5) {
        p = .1f
    } else if (c >= 18.5 && c < 24.9) {
        p = .5f
    } else if (c >= 24.9 && c < 30) {
        p = .75f
    } else if (c >= 30) {
        p = 1f
    }
    return p
}

fun Color_Classi(c: Float): Color {
    var classi = Color.White
    if (c < 18.5) {
        classi = Blue
    } else if (c >= 18.5 && c < 24.9) {
        classi = Color.Green
    } else if (c >= 24.9 && c < 30) {
        classi = DarkGray
    } else if (c >= 30) {
        classi = Red
    }
    return classi
}

fun com_BMI ( he : String , We : String) : Float {
    val cal : Float
    val w = We.toFloat()
    val h = he.toFloat() / 100
    cal = (w / h.pow(2))
    return cal
}