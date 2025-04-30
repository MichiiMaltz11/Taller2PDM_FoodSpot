package com.pdmtaller2.O0100121_MichelleMaltez.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.O0100121_MichelleMaltez.ui.components.BottomNavigationBar
import com.pdmtaller2.O0100121_MichelleMaltez.ui.screens.HomeScreen
import com.pdmtaller2.O0100121_MichelleMaltez.ui.screens.OrdersScreen
import com.pdmtaller2.O0100121_MichelleMaltez.ui.screens.SearchScreen

@Composable
fun FoodSpotApp() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) { HomeScreen() }
            composable(Screen.Search.route) { SearchScreen() }
            composable(Screen.Orders.route) { OrdersScreen() }
        }
    }
}
