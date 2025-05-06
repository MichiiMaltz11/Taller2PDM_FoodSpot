package com.pdmtaller2.O0100121_MichelleMaltez.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdmtaller2.O0100121_MichelleMaltez.models.Dish
import com.pdmtaller2.O0100121_MichelleMaltez.navigation.FoodSpotApp

@Composable
fun DishItem(dish: Dish, onAddToCart: (Dish) -> Unit) {
    val context = LocalContext.current
    val imageResId = context.resources.getIdentifier(
        dish.imageUrl,
        "drawable",
        context.packageName
    )

    Column(
        modifier = Modifier
            .width(400.dp)
            .padding(vertical = 8.dp)
            .padding(horizontal = 75.dp)
    ) {
        if (imageResId != 0) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = dish.name,
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxSize()
                    .clip(RoundedCornerShape(12.dp))
            )
        } else {
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
            ) {
                Text(
                    "Imagen no encontrada 😢",
                    modifier = Modifier.padding(8.dp),
                    fontSize = 12.sp
                )
            }
        }

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

        Button(
            onClick = {
                onAddToCart(dish)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text("Agregar al carrito")
        }
    }
}
@Preview
@Composable
fun Prev ()
{
    FoodSpotApp()
}
