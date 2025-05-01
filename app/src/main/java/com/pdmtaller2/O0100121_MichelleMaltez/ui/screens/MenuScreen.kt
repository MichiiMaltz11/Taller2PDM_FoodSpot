package com.pdmtaller2.O0100121_MichelleMaltez.ui.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.pdmtaller2.O0100121_MichelleMaltez.data.Restaurants
import androidx.compose.ui.platform.LocalContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(restaurantId: Int, onBackPressed: () -> Unit) {
    // Buscar el restaurante por ID
    val restaurant = Restaurants.find { it.id == restaurantId }

    // Estado para la búsqueda
    var searchQuery by remember { mutableStateOf("") }

    // Filtro de platillos
    val filteredDishes = restaurant?.menu?.filter {
        it.name.contains(searchQuery, ignoreCase = true)
    } ?: listOf()

    // Para mostrar el toast
    val context = LocalContext.current

    restaurant?.let {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(it.name, fontSize = 20.sp, fontWeight = FontWeight.Bold) },
                    navigationIcon = {
                        IconButton(onClick = onBackPressed) {
                            Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                        }
                    }
                )
            }
        ) { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .padding(16.dp)
            ) {
                // Descripción del restaurante
                Text(
                    text = it.description,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(vertical = 8.dp)
                )

                // Barra de búsqueda
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    placeholder = { Text("Buscar platillo...") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search)
                )

                // Lista de platillos
                LazyColumn(modifier = Modifier.fillMaxWidth()) {
                    items(filteredDishes.size) { index ->
                        val dish = filteredDishes[index]
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp)
                        ) {
                            Image(
                                painter = rememberAsyncImagePainter(dish.imageUrl),
                                contentDescription = dish.name,
                                modifier = Modifier
                                    .height(100.dp)
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(12.dp))
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = dish.name,
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = dish.description,
                                style = MaterialTheme.typography.bodySmall
                            )

                            // Botón "Agregar al carrito"
                            Button(
                                onClick = {
                                    // Mostrar el Toast
                                    Toast.makeText(context, "${dish.name} agregado al carrito", Toast.LENGTH_SHORT).show()
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp)
                            ) {
                                Text("Agregar al carrito")
                            }
                        }
                    }
                }
            }
        }
    } ?: Text("Restaurante no encontrado")
}
