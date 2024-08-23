package com.example.layoutcompose.ui.screen.sampleLazy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Lazy_colum(modifier: Modifier = Modifier) {
    var Model_object: List<Model_object> = listOf(
        Model_object("hello", 12),
        Model_object("abtin", 13),
    )
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
    ) {
        LazyColumn(
            modifier = modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(Model_object) {
                Card_Column(data = it)
            }
            item { Text(text = "hello") }
        }

    }
    Row {
        LazyRow(
            Modifier
                .fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Absolute.Center
            ) {
            items(Model_object) {
                Card_Column(data = it)
            }
        }
    }
}

@Composable
fun Card_Column(modifier: Modifier = Modifier, data: Model_object) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 2.dp, horizontal = 3.dp)
            .height(100.dp),
        colors = CardDefaults.cardColors(
            contentColor = Color.Blue,

        )
    ) {
        Text(text = data.name)
        Text(text = data.age.toString())
    }

}

data class Model_object(
    var name: String,
    var age: Int
)

@Preview
@Composable
private fun Test() {
    Lazy_colum()
}