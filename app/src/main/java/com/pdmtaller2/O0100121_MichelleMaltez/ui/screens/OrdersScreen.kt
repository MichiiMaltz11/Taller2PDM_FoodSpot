package com.pdmtaller2.O0100121_MichelleMaltez.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun OrdersScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Título
        Text(text = "Mis órdenes", style = MaterialTheme.typography.headlineMedium)

        // Espacio
        Spacer(modifier = Modifier.height(32.dp))

        // Mensaje si no hay órdenes
        Text(text = "No hay órdenes registradas", style = MaterialTheme.typography.bodyMedium)
    }
}
