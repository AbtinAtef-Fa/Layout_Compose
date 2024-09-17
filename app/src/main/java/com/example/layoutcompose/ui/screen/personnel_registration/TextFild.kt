package com.example.layoutcompose.ui.screen.personnel_registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
fun TextPersonal(modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("") }
    var family by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var nationalCode by remember { mutableStateOf("") }

    var isValidName by remember { mutableStateOf(false) }
    var isValidFamily by remember { mutableStateOf(false) }
    var isValidPhone by remember { mutableStateOf(false) }
    var isValidEmail by remember { mutableStateOf(false) }
    var isValidAddress by remember { mutableStateOf(false) }
    var isValidNational by remember { mutableStateOf(false) }

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        Column(
            modifier = modifier
                .background(color = colorResource(R.color.blue_dialog))
                .padding(16.dp) // افزودن فاصله بین ستون و لبه صفحه
        ) {
            OutlinedTextField(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = name,
                onValueChange = { nameInput ->
                    name = nameInput
                    isValidName = nameInput.isNotEmpty()
                },
                label = { Text("نام", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            if (!isValidName) {
                Text(
                    text = "نام نامعتبر",
                    color = Color.Red,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
            }

            OutlinedTextField(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = family,
                onValueChange = { familyInput ->
                    family = familyInput
                    isValidFamily = familyInput.isNotEmpty()
                },
                label = { Text("فامیل", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            if (!isValidFamily) {
                Text(
                    text = "فامیل نامعتبر",
                    color = Color.Red,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
            }
            OutlinedTextField(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = phone,
                onValueChange = { phoneInput ->
                    phone = phoneInput
                    isValidPhone = phoneInput.isNotEmpty()
                },
                label = { Text("تلفن", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            if (!isValidPhone) {
                Text(
                    text = "تلفن نامعتبر",
                    color = Color.Red,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
            }
            OutlinedTextField(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = email,
                onValueChange = { emailInput ->
                    email = emailInput
                    isValidEmail = emailInput.isNotEmpty()
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                label = { Text("ایمیل", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            if (!isValidEmail) {
                Text(
                    text = "ایمیل نامعتبر",
                    color = Color.Red,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
            }
            OutlinedTextField(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = address,
                onValueChange = { addressInput ->
                    address = addressInput
                    isValidAddress = addressInput.isNotEmpty()
                },
                label = { Text("آدرس", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            if (!isValidAddress) {
                Text(
                    text = "آدرس نامعتبر",
                    color = Color.Red,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
            }
            OutlinedTextField(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = nationalCode,
                onValueChange = { nationalInput ->
                    nationalCode = nationalInput
                    isValidNational = nationalInput.isNotEmpty()
                },
                label = { Text("کدملی", color = Color.White) },
                textStyle = TextStyle(color = Color.White),
                singleLine = true
            )
            if (!isValidNational) {
                Text(
                    text = "کد ملی نامعتبر",
                    color = Color.Red,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
            }
        }
    }
}