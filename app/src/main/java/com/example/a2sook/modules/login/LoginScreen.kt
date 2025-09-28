package com.example.a2sook.modules.login

import android.app.Activity
import android.content.Intent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a2sook.components.LogoText
import androidx.compose.ui.platform.LocalContext

@Composable
fun LoginScreen(
    onSignUpClick: () -> Unit,
    onLoginClick: () -> Unit,
) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LogoText()
            Spacer(modifier = Modifier.height(24.dp))

            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { /* TODO: handle login here */ },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            ) {
                Text("Login")
            }

            OutlinedButton(
                onClick = onSignUpClick,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Sign Up")
            }

            Text(
                text = "Forgot Password?",
                color = Color.Blue,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .clickable {
                        // 👉 handle click here
                    }
            )
        }
    }
}

//@Composable
//fun LogoText() {
//    Text(
//        buildAnnotatedString {
//            append("2S")
//            withStyle(style = SpanStyle(color = Color(0xFFFF9800))) { // Orange O
//                append("O")
//            }
//            append("OK")
//        },
//        fontSize = 32.sp,
//        fontWeight = FontWeight.Bold
//    )
//}
