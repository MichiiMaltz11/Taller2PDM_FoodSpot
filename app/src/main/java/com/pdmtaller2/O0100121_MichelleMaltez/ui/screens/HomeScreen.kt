package com.pdmtaller2.O0100121_MichelleMaltez.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdmtaller2.O0100121_MichelleMaltez.data.Restaurants
import com.pdmtaller2.O0100121_MichelleMaltez.ui.components.CategorySection

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
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            val categoryMap = Restaurants
                .flatMap { restaurant -> restaurant.categories.map { it to restaurant } }
                .groupBy({ it.first }, { it.second })
                .mapValues { (_, list) -> list.distinct() }

            categoryMap.forEach { (category, restaurants) ->
                item {
                    CategorySection(
                        category = category,
                        restaurants = restaurants,
                        onRestaurantClick = onRestaurantClick
                    )
                }
            }
        }
    }
}
