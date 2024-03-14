package com.example.tedo.MVVM.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun Login(modifier: Modifier = Modifier){
    Column(
        modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Text("Brugernavn", fontWeight = FontWeight.Bold)
        OutlinedTextField(value = "Brugernavn", onValueChange = {}, shape = RoundedCornerShape(12.dp))
        Spacer(modifier = Modifier.height(16.dp))
        Text("Kodeord", fontWeight = FontWeight.Bold)
        OutlinedTextField(value = "Kodeord", onValueChange = {}, shape = RoundedCornerShape(12.dp))
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /*TODO*/ }) {
            Text("Login")
        }
    }


}
