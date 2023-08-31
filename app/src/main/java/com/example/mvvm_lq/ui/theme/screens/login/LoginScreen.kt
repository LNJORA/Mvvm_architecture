package com.example.mvvm_lq.ui.theme.screens.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mvvm_lq.navigation.ROUT_LOGIN
import com.example.mvvm_lq.navigation.ROUT_REGISTER


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun loginscreen(navController:NavHostController) {
    var password by remember { mutableStateOf(TextFieldValue(""))}
    var email by remember { mutableStateOf(TextFieldValue(""))}
    Column(modifier = Modifier
        .fillMaxWidth(),

        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Login Here",
            color = Color.Cyan,
            fontFamily = FontFamily.Serif,
            fontSize = 28.sp

        )

        OutlinedTextField(value =email , onValueChange ={email=it} )
        OutlinedTextField(value =password , onValueChange ={password=it} )


    }
    Button(onClick = {},
        colors = ButtonDefaults.buttonColors(Color.Red),
        shape = CircleShape) {
        Text(text = "Login")

    }
    Button(onClick = {
                     navController.navigate(ROUT_REGISTER)
    },
        colors = ButtonDefaults.buttonColors(Color.Red),
        shape = CircleShape) {
        Text(text = "No Account? Register HERE.")

    }
}

