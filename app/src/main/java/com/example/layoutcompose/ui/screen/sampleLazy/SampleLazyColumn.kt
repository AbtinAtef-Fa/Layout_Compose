package com.example.layoutcompose.ui.screen.sampleLazy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SampleLazyColumn(modifier: Modifier = Modifier) {

//    LazyColumn {
//        items(10){
//            Text(text = "samal sssss")
//        }
//        item {
//            Text(text = " Hello3")
//        }
//        item {
//            Text(text = " Hello2")
//        }
//    }
    var list = listOf("car", "bus", "cat", "dog", "blue", "black")
    val dataModel:List<DataModel> = listOf(
        DataModel("alex",22,"alex@gmail", iconCheck = Icons.Default.Build),
        DataModel("sara",22,"sara@gmail", iconCheck = Icons.Default.AccountCircle),
        DataModel("peeter",22,"peeter@gmail", iconCheck = Icons.Default.Done),
        DataModel("reza",22,"reza@gmail", iconCheck = Icons.Default.Call),
        DataModel("ali",22,"ali@gmail", iconCheck = Icons.Default.Close),
        DataModel("peeter",22,"peeter@gmail", iconCheck = Icons.Default.Done),
        DataModel("ali",22,"ali@gmail", iconCheck = Icons.Default.Close),
        DataModel("sara",22,"sara@gmail", iconCheck = Icons.Default.AccountCircle),
        DataModel("peeter",22,"peeter@gmail", iconCheck = Icons.Default.Done),
    )

    LazyColumn(
        modifier.fillMaxWidth()
    ){
        items(dataModel) { item ->
            CardLazyColumn(data = item)
        }
    }

}

@Composable
fun CardLazyColumn(modifier: Modifier = Modifier, data: DataModel) {

    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp)
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
            
        ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Icon(
                    modifier = Modifier.padding(4.dp),
                    imageVector = data.iconCheck,
                    contentDescription ="info"
                )
                Text(
                    modifier = Modifier.padding(4.dp),
                    text = data.name
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Text(
                    modifier = Modifier.padding(4.dp),
                    text = "age= ${data.age.toString()}"
                )
                Text(
                    modifier = Modifier.padding(4.dp),
                    text = "email= ${data.email}"
                )

            }
        }

    }

}

@Preview
@Composable
private fun SampleLazyColumnPreview() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SampleLazyColumn()
    }

}

data class DataModel(
    val name:String,
    val age:Int,
    val email:String,
    val iconCheck:ImageVector
)