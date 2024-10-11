package com.example.layoutcompose.ui.screen.personnel_registration.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FloatingActionPersonal(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    var click by remember { mutableStateOf(false) }

    if (click == true) {
        Dialog_Save(onclickcancel = {click = false})
    }
    FloatingActionButton(
        onClick = {
            click = true
        }) {
        Text(text = "➕  آیتم جدید")
        Spacer(modifier = modifier.width(2.dp))

    }
}