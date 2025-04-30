package com.pdmtaller2.O0100121_MichelleMaltez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.pdmtaller2.O0100121_MichelleMaltez.navigation.FoodSpotApp
import com.pdmtaller2.O0100121_MichelleMaltez.ui.theme.FoodSpotByMaltezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByMaltezTheme {
                FoodSpotApp()
            }
        }
    }
}

