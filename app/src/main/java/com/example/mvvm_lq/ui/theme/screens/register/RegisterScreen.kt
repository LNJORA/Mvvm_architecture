package com.example.mvvm_lq.ui.theme.screens.register

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvm_lq.navigation.AppNavHost
import com.example.mvvm_lq.navigation.ROUT_LOGIN
import com.example.mvvm_lq.navigation.ROUT_REGISTER
import com.example.mvvm_lq.ui.theme.Mvvm_lqTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Registerscreen(navController: NavHostController) {
    var fullname by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Transparent),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login Here",
            color = Color.Magenta,
            fontFamily = FontFamily.Serif,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = fullname, onValueChange = { fullname = it },
            label = { Text(text = "Enter FullName") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = email, onValueChange = { email = it },
            label = { Text(text = "Enter Email") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = password, onValueChange = { password = it },
            label = { Text(text = "Enter Password") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate(ROUT_LOGIN) },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(11.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Register",
                fontSize = 22.sp
            )

        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate(ROUT_REGISTER) },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(11.dp),
            modifier = Modifier.fillMaxWidth()

        ) {
            Text(
                text = "No Account? Register HERE.",
                fontSize = 22.sp
            )

        }
    }
}
@Preview
@Composable
fun RegisterScreenPreview(){
    Registerscreen(rememberNavController())
}





