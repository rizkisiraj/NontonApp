package com.example.sirajmenongtonapp.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sirajmenongtonapp.R
import com.example.sirajmenongtonapp.data.models.Movie
import com.example.sirajmenongtonapp.data.models.actors
import com.example.sirajmenongtonapp.data.models.movies

@Preview(showBackground = true)
@Composable
fun DetailScreen(movie: Movie = movies[0], modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
          modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painterResource(movie.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(245.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(MaterialTheme.colorScheme.primaryContainer)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Spacer(modifier = Modifier.height(200.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.inversePrimary, shape = RoundedCornerShape(8.dp))
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "${movie.title}",
                        style = MaterialTheme.typography.displaySmall,
                        fontWeight = FontWeight.Bold
                    )

                    Box(
                        modifier = Modifier
                            .wrapContentHeight()
                            .offset(y = (-40).dp)
                    ) {
                        IconButton(
                            onClick = {
                                println("coba print")
                            },
                            enabled = true,
                            colors = IconButtonDefaults.filledIconButtonColors(
                                containerColor = MaterialTheme.colorScheme.primary
                            ),
                            modifier = Modifier.size(55.dp)
                        ) {
                            Icon(
                                Icons.Filled.PlayArrow,
                                modifier = Modifier
                                    .size(30.dp),
                                contentDescription = null
                            )
                        }
                    }
                }
                Text(
                    "${movie.rating}",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                )
                Text(movie.description,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.inversePrimary, shape = RoundedCornerShape(8.dp))
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    "Actors",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    items(actors) { actor ->
                        Image(
                            painterResource(actor.image),
                            contentScale = ContentScale.Crop,
                            contentDescription = null,
                            modifier = Modifier
                                .size(60.dp)
                                .clip(CircleShape)
                                .border(
                                    BorderStroke(2.dp, Color.White),
                                    shape = CircleShape
                                )
                        )
                    }
                }
            }
        }
    }
}