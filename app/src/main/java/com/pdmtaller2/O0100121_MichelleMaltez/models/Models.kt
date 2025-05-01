package com.pdmtaller2.O0100121_MichelleMaltez.models

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
)

data class Dish(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
)