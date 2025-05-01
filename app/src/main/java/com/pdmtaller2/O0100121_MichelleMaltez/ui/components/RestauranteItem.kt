package com.pdmtaller2.O0100121_MichelleMaltez.ui.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import com.pdmtaller2.O0100121_MichelleMaltez.models.Restaurant

@Composable
fun RestaurantItem(restaurant: Restaurant, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .width(160.dp)
            .padding(end = 12.dp)
            .clickable { onClick() }
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
            fontSize = 14.sp
        )
    }
}
