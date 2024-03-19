package com.example.tedo.MVVM.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tedo.MVVM.ViewModel.UserVM

@Composable
fun MainView(
    /*userVM: UserVM,
    navController: NavController*/
) {
    val snackMessage = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            shape = RoundedCornerShape(12.dp),
            onClick = { /*TODO*/ }) {
            Text("Se oprettede tekstdokumenter")
        }
        Button(
            shape = RoundedCornerShape(12.dp),
            onClick = { /*TODO*/ }) {
            Text("Opret tekstdokument")
        }
    }


}
