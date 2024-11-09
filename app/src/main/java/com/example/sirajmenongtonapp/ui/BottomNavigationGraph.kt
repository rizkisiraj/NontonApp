package com.example.sirajmenongtonapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sirajmenongtonapp.data.models.BottomNavScreen
import com.example.sirajmenongtonapp.data.models.movies
import com.example.sirajmenongtonapp.ui.screens.AboutScreen
import com.example.sirajmenongtonapp.ui.screens.CollectionScreen
import com.example.sirajmenongtonapp.ui.screens.DetailScreen
import com.example.sirajmenongtonapp.ui.screens.HomeScreen

@Composable
fun BottomNavGraph(navController: NavHostController, modifier: Modifier) {
    NavHost(navController = navController,  startDestination = "home__graph") {
        homeGraph(navController, modifier)
        composable(route = BottomNavScreen.Movies.route) {
            CollectionScreen(modifier)
        }
        composable(route = BottomNavScreen.About.route) {
            AboutScreen(modifier)
        }
    }
}

fun NavGraphBuilder.homeGraph(navController: NavController, modifier: Modifier) {
    navigation(startDestination = BottomNavScreen.Home.route, route = "home__graph") {
        composable(route = BottomNavScreen.Home.route) {
            HomeScreen(modifier = modifier, navController)
        }
        composable(
            route = "movie/{title}",
            arguments = listOf(
                navArgument("title") { type = NavType.StringType }
            )
        ) { navBackStackEntry ->
            val title = navBackStackEntry.arguments?.getString("title")

            title.let {
                val movieIndex = movies.indexOfFirst { it.title == title }
                DetailScreen(movies[movieIndex], modifier)
            }

        }
    }
}

