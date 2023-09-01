package com.example.mvvm_lq.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm_lq.ui.theme.screens.home.Homescreen
import com.example.mvvm_lq.ui.theme.screens.login.loginscreen
import com.example.mvvm_lq.ui.theme.screens.register.Registerscreen
import com.example.mvvm_lq.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),startDestination:String= ROUT_SPLASH) {
    NavHost(navController = navController, modifier = modifier,startDestination = startDestination){
        composable(ROUT_HOME){
            Homescreen(navController)
        }
        composable(ROUT_LOGIN){
            loginscreen(navController)
        }
        composable(ROUT_REGISTER){
            Registerscreen(navController)
        }
        composable(ROUT_SPLASH){
            SplashScreen(navController)
        }

    }

}