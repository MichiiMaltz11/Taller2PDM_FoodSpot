package com.pdmtaller2.O0100121_MichelleMaltez.navigation

sealed class Screen(val route: String) {
    object Home : Screen("restaurantes")
    object Search : Screen("Buscar")
    object Orders : Screen("Mis Ordenes")
    object RestaurantMenu : Screen("restaurantMenu/{restaurantId}") {
        fun createRoute(restaurantId: Int) = "restaurantMenu/$restaurantId"
    }

}
