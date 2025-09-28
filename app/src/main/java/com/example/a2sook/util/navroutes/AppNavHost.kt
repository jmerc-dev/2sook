package com.example.a2sook.util.navroutes

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a2sook.modules.customer.Home.CustomerHomeScreen
import com.example.a2sook.modules.login.LoginScreen
import com.example.a2sook.modules.signup.SignUpScreen
import com.example.a2sook.modules.storeowner.dashboard.StoreOwnerDashboardScreen

@Composable
fun AppNavHost(modifier: Modifier, navController: NavHostController = rememberNavController()) {

    NavHost(navController, startDestination = NavRoutes.LOGIN, modifier = modifier) {
        composable(NavRoutes.LOGIN) {
            LoginScreen(
                onSignUpClick = { navController.navigate(NavRoutes.SIGNUP) },
                onLoginClick = { navController.navigate(NavRoutes.SIGNUP) }
            )
        }
        composable(NavRoutes.SIGNUP) {
            SignUpScreen(
                onBackClick = { navController.popBackStack() },
                modifier = modifier,
                onSignUpClick = {role -> if (role == "Store Owner") navController.navigate(NavRoutes.STOREOWNER_DASHBOARD) else { navController.navigate(NavRoutes.CUSTOMER_HOME) }}
            )
        }

        composable(NavRoutes.STOREOWNER_DASHBOARD) {
            StoreOwnerDashboardScreen()
        }

        composable(NavRoutes.CUSTOMER_HOME) {
            CustomerHomeScreen()
        }
    }
}