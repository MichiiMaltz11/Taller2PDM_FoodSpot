package com.pdmtaller2.O0100121_MichelleMaltez.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdmtaller2.O0100121_MichelleMaltez.models.Restaurant
@Composable
fun RestaurantCard(restaurant: Restaurant, onClick: (Int) -> Unit) {
    val context = LocalContext.current
    val imageResId = context.resources.getIdentifier(
        restaurant.imageUrl, // sin extensión
        "drawable",
        context.packageName
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { onClick(restaurant.id) }
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            if (imageResId != 0) {
                Image(
                    painter = painterResource(id = imageResId),
                    contentDescription = restaurant.name,
                    modifier = Modifier.size(80.dp)
                )
            } else {
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(RoundedCornerShape(12.dp))
                ) {
                    Text(
                        "Imagen no disponible 😢",
                        modifier = Modifier.padding(8.dp),
                        fontSize = 12.sp
                    )
                }
            }
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
