package com.pdmtaller2.O0100121_MichelleMaltez.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BackAppBar(title: String, onBackPressed: () -> Unit) {
    TopAppBar(
        title = { Text(title, fontSize = 20.sp, fontWeight = FontWeight.Bold) },
        navigationIcon = {
            IconButton(onClick = onBackPressed) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }
        }
    )
}
