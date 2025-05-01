package com.pdmtaller2.O0100121_MichelleMaltez.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.pdmtaller2.O0100121_MichelleMaltez.data.Restaurants
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(onRestaurantClick: (Int) -> Unit) {
    var searchQuery by remember { mutableStateOf("") }

    val filteredRestaurants = remember(searchQuery) {
        Restaurants.filter { it.name.contains(searchQuery, ignoreCase = true) }
    }

    Scaffold(
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = { Text("Buscar restaurante...") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search)
            )


            Spacer(modifier = Modifier.height(16.dp))

            if (filteredRestaurants.isEmpty()) {
                Text("No se encontraron restaurantes.")
            } else {
                Column {
                    filteredRestaurants.forEach { restaurant ->
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp)
                                .clickable { onRestaurantClick(restaurant.id) }
                        ) {
                            Row(modifier = Modifier.padding(16.dp)) {
                                Image(
                                    painter = rememberAsyncImagePainter(restaurant.imageUrl),
                                    contentDescription = restaurant.name,
                                    modifier = Modifier.size(80.dp)
                                )
                                Spacer(modifier = Modifier.width(16.dp))
                                Column {
                                    Text(restaurant.name, fontSize = 18.sp)
                                    restaurant.description?.let {
                                        Text(it, fontSize = 14.sp)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
