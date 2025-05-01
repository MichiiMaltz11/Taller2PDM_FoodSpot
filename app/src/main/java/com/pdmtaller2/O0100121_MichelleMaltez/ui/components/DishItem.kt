package com.pdmtaller2.O0100121_MichelleMaltez.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.pdmtaller2.O0100121_MichelleMaltez.models.Dish

@Composable
fun DishItem(dish: Dish, onAddToCart: (Dish) -> Unit) {
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
                onAddToCart(dish)  // Llamar a la función para agregar al carrito
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text("Agregar al carrito")
        }
    }
}
