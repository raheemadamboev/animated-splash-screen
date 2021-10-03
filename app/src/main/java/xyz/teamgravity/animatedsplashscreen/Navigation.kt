package xyz.teamgravity.animatedsplashscreen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "splash") {
        composable("splash") {
            Splash(navController = navHostController)
        }

        composable("main") {
            Main()
        }
    }
}