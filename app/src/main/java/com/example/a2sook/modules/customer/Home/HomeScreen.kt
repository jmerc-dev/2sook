package com.example.a2sook.modules.customer.Home

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun CustomerHomeScreen() {

    Column (modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)){

        Text("Nearby Stores",
            modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
            textAlign =TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        // Remaining screen
        Column {
            // Recommended for you section
                Column {
                    Row(horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()) {
                        Text("Recommended for You",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text("See All",
                            fontSize = 20.sp,
                            color = Color(0xFFD95B00)
                        )
                    }
                    val scrollState = rememberScrollState()
                    Row (modifier = Modifier.horizontalScroll(scrollState)){

                        // This is a store item
                        Box (modifier = Modifier
                            .size(300.dp)
                            .border(
                                width = 1.dp,
                                color = Color.LightGray,
                                shape = RoundedCornerShape(16.dp)
                            )) {
                            Column {
                                Box (modifier = Modifier
                                    .fillMaxWidth(1f).background(Color.Gray, RoundedCornerShape(10.dp)).height(150.dp)){
                                }
                                Row(horizontalArrangement = Arrangement.SpaceAround,
                                    verticalAlignment = Alignment.CenterVertically) {
                                    Box(modifier = Modifier.size(70.dp).background(Color.LightGray, RoundedCornerShape(5.dp)))
                                    Column {
                                        Text("Jologs Eatery", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                                        Text("55 Purok 105, Tondo Manila")
                                    }
                                }

                                Row (modifier = Modifier.fillMaxWidth(1f), horizontalArrangement = Arrangement.End){
                                    OutlinedButton(
                                        onClick = {},
                                        modifier = Modifier.width(170.dp)
                                    ) {
                                        Text("View Details")
                                    }

                                    Button(
                                        onClick = {},
                                        modifier = Modifier. width(120.dp)
                                        ) {
                                        Text("Navigate")
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Box (modifier = Modifier
                            .size(300.dp)
                            .border(
                                width = 1.dp,
                                color = Color.LightGray,
                                shape = RoundedCornerShape(16.dp)
                            )) {
                            Column {
                                Box (modifier = Modifier
                                    .fillMaxWidth(1f).background(Color.Gray, RoundedCornerShape(10.dp)).height(150.dp)){
                                }
                                Row(horizontalArrangement = Arrangement.SpaceAround,
                                    verticalAlignment = Alignment.CenterVertically) {
                                    Box(modifier = Modifier.size(70.dp).background(Color.LightGray, RoundedCornerShape(5.dp)))
                                    Column {
                                        Text("Pares Ni Manang Luz", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                                        Text("72 Greenjugs 105, Cavite")
                                    }
                                }

                                Row (modifier = Modifier.fillMaxWidth(1f), horizontalArrangement = Arrangement.End){
                                    OutlinedButton(
                                        onClick = {},
                                        modifier = Modifier.width(170.dp)
                                    ) {
                                        Text("View Details")
                                    }

                                    Button(
                                        onClick = {},
                                        modifier = Modifier. width(120.dp)
                                    ) {
                                        Text("Navigate")
                                    }
                                }
                            }
                        }
                    }
                }

        }

    }
}