package com.example.news_app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavNews(){
    val navContorller = rememberNavController()

    NavHost(navController = navContorller, startDestination = "A"){
        composable(route = "A"){
            NewsHomeScreen(navController = navContorller)
        }
        composable(route =  "B"){
            Screenone(navController = navContorller)
        }
        composable(route =  "C"){
            Screentwo(navController = navContorller)
        }
        composable(route =  "D"){
            Screenthree(navController = navContorller)
        }
        composable(route =  "E"){
            Screenfour(navController = navContorller)
        }
    }
}