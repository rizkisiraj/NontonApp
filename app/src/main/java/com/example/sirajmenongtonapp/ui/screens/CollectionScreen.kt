package com.example.sirajmenongtonapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sirajmenongtonapp.data.models.movies

@Preview(showBackground = true)
@Composable
fun CollectionScreen(modifier: Modifier = Modifier) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2),
        modifier = modifier.fillMaxSize()
    ) {
        items(movies) { movie ->
            Column(
                modifier = Modifier
                    .padding(12.dp)
            ) {
                Image(
                    painterResource(movie.image),
                    contentScale = ContentScale.Crop,
                    contentDescription = movie.title,
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(0.dp, 270.dp)
                        .clip(RoundedCornerShape(12.dp))
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(movie.title)
            }
        }
    }
}