package com.devspacecomposeinit

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun App () {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "artistList") {
        composable(route = "artistList") {
            ArtistListScreen(navController)
        }
        composable(
            route = "artistDetail" + "/{itemId}",
            arguments = listOf(navArgument("itemId") { type = NavType.IntType })
        ){
            val artistId = requireNotNull(it.arguments?.getInt("itemId"))
            ArtistDetailScreen(
                navController = navController,
                artistId = artistId
            )
        }
    }
}