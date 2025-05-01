package com.pdmtaller2.O0100121_MichelleMaltez.data

import com.pdmtaller2.O0100121_MichelleMaltez.models.Dish
import com.pdmtaller2.O0100121_MichelleMaltez.models.Restaurant

val Restaurants = listOf(
    Restaurant(
        id = 1,
        name = "Burger House",
        description = "Deliciosas hamburguesas caseras",
        imageUrl = "https://i.imgur.com/BurgerHouse.jpg",
        categories = listOf("Comida Rápida", "Americana"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Hamburguesa Clásica",
                description = "Pan artesanal, carne 100% res, queso y vegetales.",
                imageUrl = "https://i.imgur.com/ClassicBurger.jpg"
            ),
            Dish(
                id = 2,
                name = "Papas Fritas",
                description = "Crujientes papas con salsa especial.",
                imageUrl = "https://i.imgur.com/FrenchFries.jpg"
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "Taquería El Mexicano",
        description = "Tacos auténticos y sabrosos",
        imageUrl = "https://i.imgur.com/TacoPlace.jpg",
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            Dish(
                id = 3,
                name = "Tacos al Pastor",
                description = "Tortilla con carne marinada, piña y cebolla.",
                imageUrl = "https://i.imgur.com/AlPastor.jpg"
            ),
            Dish(
                id = 4,
                name = "Nachos con Queso",
                description = "Totopos con queso fundido y jalapeños.",
                imageUrl = "https://i.imgur.com/Nachos.jpg"
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "Pasta Bella",
        description = "Sabores auténticos italianos",
        imageUrl = "https://i.imgur.com/PastaBella.jpg",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(
                id = 5,
                name = "Spaghetti Bolognese",
                description = "Clásico espagueti con salsa de carne.",
                imageUrl = "https://i.imgur.com/Spaghetti.jpg"
            ),
            Dish(
                id = 6,
                name = "Lasaña",
                description = "Capas de pasta con carne y bechamel.",
                imageUrl = "https://i.imgur.com/Lasagna.jpg"
            )
        )
    )
)