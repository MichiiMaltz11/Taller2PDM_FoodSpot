package com.pdmtaller2.O0100121_MichelleMaltez.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pdmtaller2.O0100121_MichelleMaltez.data.Restaurants
import com.pdmtaller2.O0100121_MichelleMaltez.ui.components.DishItem
import com.pdmtaller2.O0100121_MichelleMaltez.ui.components.BackAppBar
import com.pdmtaller2.O0100121_MichelleMaltez.ui.components.SearchBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(restaurantId: Int, onBackPressed: () -> Unit) {

    val restaurant = Restaurants.find { it.id == restaurantId }

    var searchQuery by remember { mutableStateOf("") }

    val filteredDishes = restaurant?.menu?.filter {
        it.name.contains(searchQuery, ignoreCase = true)
    } ?: listOf()

    val context = LocalContext.current

    restaurant?.let {
        Scaffold(
            topBar = {
                BackAppBar(title = it.name, onBackPressed = onBackPressed)
            }
        ) { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .padding(16.dp)
            ) {
                Text(
                    text = it.description,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(vertical = 8.dp)
                )

                SearchBar(searchQuery = searchQuery, onSearchQueryChange = { searchQuery = it })

                LazyColumn(modifier = Modifier.fillMaxWidth()) {
                    items(filteredDishes.size) { index ->
                        val dish = filteredDishes[index]
                        DishItem(dish = dish, onAddToCart = { selectedDish ->
                            Toast.makeText(
                                context,
                                "${selectedDish.name} agregado al carrito",
                                Toast.LENGTH_SHORT
                            ).show()
                        })
                    }
                }
            }
        }
    } ?: Text("Restaurante no encontrado")
}
