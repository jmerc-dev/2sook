package com.example.a2sook.modules.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.a2sook.components.LogoText
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle

@Composable
fun SignUpScreen(onBackClick: () -> Unit, modifier: Modifier) {

    var selectedRole by remember { mutableStateOf("Customer") }

    Box(
        modifier = modifier.fillMaxSize().padding(horizontal = 16.dp, vertical = 16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                LogoText()
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text("Full Name",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start)

            OutlinedTextField(
                value = "",
                placeholder = { Text("Juan Dela Cruz") },
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
            )

            Text("Email Address",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start)

            OutlinedTextField(
                value = "",
                placeholder = { Text("juan.delacruz@example.com") },
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
            )

            Text("Password",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start)

            OutlinedTextField(
                value = "123",
                onValueChange = {},
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                modifier = Modifier
                    .fillMaxWidth()
            )

            Text("Register as:",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start)

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),

            ) {
                // Customer Box
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(50.dp)
                        .clickable { selectedRole = "Customer" }
                        .background(
                            if (selectedRole == "Customer") MaterialTheme.colorScheme.primary else Color.LightGray,
                            shape = RoundedCornerShape(8.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Filled.Face,
                            contentDescription = "Customer",
                            tint = if (selectedRole == "Customer") Color.White else Color.Black
                        )
                        Spacer(modifier = Modifier.width(8.dp))


                        Text(
                            "Customer",
                            color = if (selectedRole == "Customer") Color.White else Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    }


                }

                // Store Owner Box
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(50.dp)
                        .clickable { selectedRole = "Store Owner" }
                        .background(
                            if (selectedRole == "Store Owner") MaterialTheme.colorScheme.primary else Color.LightGray,
                            shape = RoundedCornerShape(8.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Filled.ShoppingCart,
                            contentDescription = "Store Owner",
                            tint = if (selectedRole == "Store Owner") Color.White else Color.Black
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            "Store Owner",
                            color = if (selectedRole == "Store Owner") Color.White else Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { /* TODO: handle login here */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Sign Up")
            }

            Spacer(modifier = Modifier.height(30.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                Text("Already have an account? ")
                Text("Login ",
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.clickable { onBackClick() })
            }
        }
    }
}