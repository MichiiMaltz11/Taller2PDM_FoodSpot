package com.pdmtaller2.O0100121_MichelleMaltez.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.pdmtaller2.O0100121_MichelleMaltez.models.Restaurant

@Composable
fun RestaurantCard(restaurant: Restaurant, onClick: (Int) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { onClick(restaurant.id) }
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            // Imagen del restaurante
            Image(
                painter = rememberAsyncImagePainter(restaurant.imageUrl),
                contentDescription = restaurant.name,
                modifier = Modifier.size(80.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    restaurant.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                restaurant.description?.let {
                    Text(it, fontSize = 14.sp)
                }
            }
        }
    }
}
