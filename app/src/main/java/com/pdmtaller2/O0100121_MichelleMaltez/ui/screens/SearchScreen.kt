package com.pdmtaller2.O0100121_MichelleMaltez.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdmtaller2.O0100121_MichelleMaltez.data.Restaurants
import com.pdmtaller2.O0100121_MichelleMaltez.ui.components.RestaurantCard
import com.pdmtaller2.O0100121_MichelleMaltez.ui.components.SearchBar
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(onRestaurantClick: (Int) -> Unit) {
    var searchQuery by remember { mutableStateOf("") }

    val filteredRestaurants = remember(searchQuery) {
        Restaurants.filter { restaurant ->
            restaurant.name.contains(searchQuery, ignoreCase = true) ||
                    restaurant.menu.any { it.name.contains(searchQuery, ignoreCase = true) } ||
                    restaurant.categories.any { it.contains(searchQuery, ignoreCase = true) }
        }
    }

    Scaffold { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            SearchBar(
                searchQuery = searchQuery,
                onSearchQueryChange = { searchQuery = it }
            )

            Spacer(modifier = Modifier.height(16.dp))

            if (filteredRestaurants.isEmpty()) {
                Text("No se encontraron restaurantes o platillos.")
            } else {
                Column {
                    filteredRestaurants.forEach { restaurant ->
                        RestaurantCard(
                            restaurant = restaurant,
                            onClick = { onRestaurantClick(restaurant.id) }
                        )
                    }
                }
            }
        }
    }
}
