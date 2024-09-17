package com.example.layoutcompose.ui.screen.personnel_registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.layoutcompose.R

@Composable
private fun DialogPersonal() {

    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {

        Dialog(onDismissRequest = {}) {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
            ) {
                Column(
                    modifier = Modifier
                        .background(color = colorResource(R.color.blue_dialog))
//                    .fillMaxSize()
                        .padding(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Save,
                        contentDescription = null,
                        tint = Color.White
                    )
                    Text(
                        text = "ثبت اطلاعات", color = Color.White, textAlign = TextAlign.Center
                    )
                    TextPersonal(modifier = Modifier)
                    Text(
                        text = "آیا مایل هستید که ثبت را کنسل کنید؟",
                        color = Color.White
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        TextButton(onClick = {}) {
                            Text("تایید", color = Color.White)
                        }
                        TextButton(onClick = {}) {
                            Text("لغو", color = Color.White)
                        }
                    }
                }
            }
        }
    }
}
