package com.example.a2sook.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

@Composable
fun LogoText() {
    Text(
        buildAnnotatedString {
            append("2S")
            withStyle(style = SpanStyle(color = Color(0xFFFF9800))) { // Orange O
                append("O")
            }
            append("OK")
        },
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
}