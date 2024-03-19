package com.example.tedo.MVVM.View

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tedo.MVVM.ViewModel.UserVM

@Composable
fun Navigation(
    userVM: UserVM = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screen.LoginScreen.route
    ) {
        composable(Screen.LoginScreen.route) {
            LoginView(/*userVM,*/ navController)
        }
        composable(Screen.HomeScreen.route){
            MainView(/*userVM, navController*/)
        }

    }
}