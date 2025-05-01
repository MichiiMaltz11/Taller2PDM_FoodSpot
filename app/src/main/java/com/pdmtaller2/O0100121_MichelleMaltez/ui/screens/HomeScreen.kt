package com.pdmtaller2.O0100121_MichelleMaltez.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.pdmtaller2.O0100121_MichelleMaltez.data.Restaurants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(onRestaurantClick: (Int) -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("FoodSpot", fontSize = 20.sp, fontWeight = FontWeight.Bold) }
            )
        }
    ) { padding ->
        LazyColumn(modifier = Modifier
            .padding(padding)
            .padding(16.dp)
        ) {
            val categoryMap = Restaurants
                .flatMap { restaurant -> restaurant.categories.map { it to restaurant } }
                .groupBy({ it.first }, { it.second })
                .mapValues { (_, list) -> list.distinct() }

            categoryMap.forEach { (category, restaurants) ->
                item {
                    Text(
                        text = category,
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )

                    LazyRow {
                        items(restaurants.size) { index ->
                            val restaurant = restaurants[index]
                            Column(
                                modifier = Modifier
                                    .width(160.dp)
                                    .padding(end = 12.dp)
                                    .clickable { onRestaurantClick(restaurant.id) }
                            ) {
                                Image(
                                    painter = rememberAsyncImagePainter(restaurant.imageUrl),
                                    contentDescription = restaurant.name,
                                    modifier = Modifier
                                        .height(100.dp)
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(12.dp))
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = restaurant.name,
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.SemiBold,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
