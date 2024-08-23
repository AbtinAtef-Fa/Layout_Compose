package com.example.layoutcompose.ui.screen.sampleLazy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SampleLazyRow(modifier: Modifier = Modifier) {

    var dataModel: List<DataModel> = listOf(
        DataModel("alex", 22, "alex@gmail", iconCheck = Icons.Default.Build),
        DataModel("sara", 22, "sara@gmail", iconCheck = Icons.Default.AccountCircle),
        DataModel("peeter", 22, "peeter@gmail", iconCheck = Icons.Default.Done),
        DataModel("reza", 22, "reza@gmail", iconCheck = Icons.Default.Call),
        DataModel("ali", 22, "ali@gmail", iconCheck = Icons.Default.Close),
        DataModel("peeter", 22, "peeter@gmail", iconCheck = Icons.Default.Done),
        DataModel("ali", 22, "ali@gmail", iconCheck = Icons.Default.Close),
        DataModel("sara", 22, "sara@gmail", iconCheck = Icons.Default.AccountCircle),
        DataModel("peeter", 22, "peeter@gmail", iconCheck = Icons.Default.Done),
    )

    LazyRow {
        items(dataModel) {
            CardLazyRow(data = it)
        }
    }
}

@Composable
fun CardLazyRow(modifier: Modifier = Modifier, data: DataModel) {

    Card(
        modifier = modifier
            .size(80.dp)
            .padding(horizontal = 3.dp, vertical = 4.dp)
            .background(Color.Red),
        colors = CardDefaults.cardColors(
            contentColor = Color.Green,
            containerColor = Color.Blue
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

            ) {
            Icon(
                modifier = Modifier.padding(2.dp),
                imageVector = data.iconCheck,
                contentDescription = "info"
            )
            Text(
                modifier = Modifier.padding(2.dp),
                text = data.name
            )
        }
    }
}

@Preview
@Composable
private fun SampleLazyRowPreview() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SampleLazyRow()
    }
}