package com.pdmtaller2.O0100121_MichelleMaltez.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import com.pdmtaller2.O0100121_MichelleMaltez.models.Restaurant

@Composable
fun CategorySection(category: String, restaurants: List<Restaurant>, onRestaurantClick: (Int) -> Unit) {
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(
            text = category,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        LazyRow {
            items(restaurants.size) { index ->
                val restaurant = restaurants[index]
                RestaurantItem(restaurant = restaurant, onClick = { onRestaurantClick(restaurant.id) })
            }
        }
    }
}
