package com.example.sirajmenongtonapp.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.sirajmenongtonapp.R
import com.example.sirajmenongtonapp.data.models.actors
import com.example.sirajmenongtonapp.data.models.movies
import com.example.sirajmenongtonapp.ui.components.MovieCard

@Composable
fun HomeScreen(modifier: Modifier = Modifier, navController: NavController) {
    val gradientColors = listOf(
        Color(0xFF3A7BD5), // Sky Blue
        Color(0xFF3F51B5), // Indigo Blue
        Color(0xFF8E44AD), // Medium Purple
        Color(0xFF9B59B6)  // Light Purple
    )

    Column(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(top = 20.dp)
    ) {
        Text(
            "Story",
            style = MaterialTheme.typography.displaySmall,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(24.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(actors) { actor ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(actor.image),
                        contentScale = ContentScale.Crop,
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(
                                border = BorderStroke(4.dp, Brush.sweepGradient(gradientColors)),
                                shape = CircleShape
                            )
                            .padding(8.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        actor.name,
                        style = MaterialTheme.typography.labelSmall
                    )
                }
            }
        }
        LazyColumn(
            modifier = modifier.fillMaxSize(),
        ) {
            item {
                Text(
                    "Movie",
                    style = MaterialTheme.typography.displaySmall,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(44.dp))
            }
            items(movies) { movie ->
                MovieCard(movie, onClick = {
                    navController.navigate("movie/${movie.title}")
                })
                Spacer(modifier = Modifier.height(44.dp))
            }
        }
    }
}