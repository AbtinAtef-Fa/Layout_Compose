package com.example.layoutcompose.ui.screen.personnel_registration.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.example.layoutcompose.R

@Composable
fun Btn_and_TextFilde(modifier: Modifier = Modifier, ) {

    var name by remember { mutableStateOf("") }
    var family by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var nationalCode by remember { mutableStateOf("") }

    // Validation messages
    var validationMessage by remember { mutableStateOf("") }

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Column(
            modifier = modifier
                .background(color = colorResource(R.color.blue_dialog))
                .padding(14.dp)
        ) {
            OutlinedTextField(
                modifier = modifier.fillMaxWidth().padding(bottom = 8.dp),
                value = name,
                onValueChange = { name = it },
                label = { Text("نام", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            OutlinedTextField(
                modifier = modifier.fillMaxWidth().padding(bottom = 6.dp),
                value = family,
                onValueChange = { family = it },
                label = { Text("فامیل", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            OutlinedTextField(
                modifier = modifier.fillMaxWidth().padding(bottom = 6.dp),
                value = phone,
                onValueChange = { phone = it },
                label = { Text("تلفن", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            OutlinedTextField(
                modifier = modifier.fillMaxWidth().padding(bottom = 6.dp),
                value = email,
                onValueChange = { email = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                label = { Text("ایمیل", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            OutlinedTextField(
                modifier = modifier.fillMaxWidth().padding(bottom = 6.dp),
                value = address,
                onValueChange = { address = it },
                label = { Text("آدرس", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            OutlinedTextField(
                modifier = modifier.fillMaxWidth().padding(bottom = 6.dp),
                value = nationalCode,
                onValueChange = { nationalCode = it },
                label = { Text("کدملی", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )

            // Validation Message
            if (validationMessage.isNotEmpty()) {
                Text(
                    text = validationMessage,
                    color = Color.Red,
                    textAlign = TextAlign.Center,
                    modifier = modifier.fillMaxWidth().padding(top = 8.dp)
                )
            }

            // Submit Button
            TextButton(
                onClick = {
                    // Check for validation
                    validationMessage = when {
                        name.isBlank() -> "لطفا نام را وارد کنید"
                        family.isBlank() -> "لطفا فامیل را وارد کنید"
                        phone.isBlank() -> "لطفا تلفن را وارد کنید"
                        email.isBlank() -> "لطفا ایمیل را وارد کنید"
                        address.isBlank() -> "لطفا آدرس را وارد کنید"
                        nationalCode.isBlank() -> "لطفا کد ملی را وارد کنید"
                        else -> "همه اطلاعات با موفقیت ثبت شد!"

                    }
                },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("تایید", color = Color.Green)
            }
        }
    }
}