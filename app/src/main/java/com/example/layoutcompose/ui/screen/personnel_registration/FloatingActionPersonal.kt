package com.example.layoutcompose.ui.screen.personnel_registration

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FloatingActionPersonal(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {

    FloatingActionButton(
        onClick = {
            onClick
        }) {
        Text(text = "➕  آیتم جدید")
        Spacer(modifier = modifier.width(2.dp))

    }
}