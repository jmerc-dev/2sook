package com.example.a2sook.modules.storeowner.dashboard

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp

@Composable
fun StoreOwnerDashboardScreen() {

    Column (modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)){
        Text("Dashboard",
            modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
            textAlign =TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Text("Store Analytics",
            modifier = Modifier.fillMaxWidth(),
            textAlign =TextAlign.Left,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Column (modifier = Modifier.fillMaxWidth()) {
            // Start of row
            Row (modifier = Modifier.fillMaxWidth()) {

                // Cell
                Box (modifier = Modifier.wrapContentSize().weight(1f)){
                    Column {
                        Row(
                            modifier = Modifier
                                .padding(8.dp),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Face,
                                contentDescription = "Person"
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Total Visits")
                        }
                        Text("1,128", color = Color.Red, fontSize = 25.sp)
                    }
                }

                Box (modifier = Modifier.wrapContentSize().weight(1f)) {
                    Column {
                        Row(
                            modifier = Modifier
                                .padding(8.dp),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Filled.FavoriteBorder,
                                contentDescription = "Person"
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Average Rating")
                        }
                        Text("4.7", color = Color.Red, fontSize = 25.sp)
                    }
                }

            }

        }
        Spacer(modifier = Modifier.height(50.dp))
        Text("Customer Reviews",
            modifier = Modifier.fillMaxWidth(),
            textAlign =TextAlign.Left,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )


        val scrollState = rememberScrollState()
        Column(modifier = Modifier.padding(vertical = 10.dp, horizontal = 30.dp).verticalScroll(scrollState)) {
            // Start of Reviews List
            Column {
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Alice Johnson", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                    Spacer(modifier = Modifier.height(20.dp))
                    Text("5/5", color = Color.Black, fontSize = 20.sp)
                }
                Text("Excellent service and very friendly staff! The product arrived faster than I expected, and it was packaged very carefully. I would definitely recommend this store to my friends and family.")
                Text("2 days ago", color = Color.Gray, fontStyle = FontStyle.Italic)
            }

            Column {
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Michael Lee", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                    Spacer(modifier = Modifier.height(20.dp))
                    Text("4/5", color = Color.Black, fontSize = 20.sp)
                }
                Text("Great product quality and exactly as described on the website. Delivery took a bit longer than I hoped, but the customer support kept me updated. Overall, a positive experience.")
                Text("5 days ago", color = Color.Gray, fontStyle = FontStyle.Italic)
            }

            Column {
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Priya Singh", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                    Spacer(modifier = Modifier.height(20.dp))
                    Text("3/5", color = Color.Black, fontSize = 20.sp)
                }
                Text("The product works okay, but I found the instructions a little confusing at first. It took me some time to set it up properly. With clearer directions, this would be much better.")
                Text("13 days ago", color = Color.Gray, fontStyle = FontStyle.Italic)
            }

            Column {
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Daniel Kim", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                    Spacer(modifier = Modifier.height(20.dp))
                    Text("5/5", color = Color.Black, fontSize = 20.sp)
                }
                Text("Amazing experience from start to finish! The shipping was fast, and the support team was very responsive when I had questions. I’m extremely satisfied with my purchase.")
                Text("15 days ago", color = Color.Gray, fontStyle = FontStyle.Italic)
            }

            Column {
                Row(modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Sofia Martinez", fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                    Spacer(modifier = Modifier.height(20.dp))
                    Text("4/5", color = Color.Black, fontSize = 20.sp)
                }
                Text("Good value for money and the quality exceeded my expectations. I would purchase from this seller again, though I wish there were more color options available. Overall, very happy with my order.")
                Text("16 days ago", color = Color.Gray, fontStyle = FontStyle.Italic)
            }
        }

    }
}