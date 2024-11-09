package com.example.sirajmenongtonapp.data.models

import com.example.sirajmenongtonapp.R

data class Movie(
    val title: String = "",
    val description: String = "",
    val director: String = "",
    val rating: Double = 9.0,
    val image: Int
)

val movies = listOf(
    Movie(
        title = "Inception",
        description = "A skilled thief is given a chance to erase his criminal record by infiltrating dreams.",
        director = "Christopher Nolan",
        rating = 8.8,
        image = R.drawable.inception
    ),
    Movie(
        title = "The Godfather",
        description = "The aging patriarch of an organized crime dynasty transfers control to his reluctant son.",
        director = "Francis Ford Coppola",
        rating = 9.2,
        image = R.drawable.godfather
    ),
    Movie(
        title = "The Dark Knight",
        description = "Batman faces the Joker, a criminal mastermind who wants to plunge Gotham City into anarchy.",
        director = "Christopher Nolan",
        rating = 9.0,
        image = R.drawable.dark_knight
    ),
    Movie(
        title = "Pulp Fiction",
        description = "The lives of two mob hitmen, a boxer, and a pair of bandits intertwine in four tales of violence.",
        director = "Quentin Tarantino",
        rating = 8.9,
        image = R.drawable.pulp_fiction
    ),
    Movie(
        title = "Forrest Gump",
        description = "The life story of Forrest Gump, a kind-hearted man with a low IQ, and his accidental influence on key historical events.",
        director = "Robert Zemeckis",
        rating = 8.8,
        image = R.drawable.forrest_gump
    ),
    Movie(
        title = "The Matrix",
        description = "A computer hacker learns about the true nature of his reality and his role in the war against its controllers.",
        director = "Lana Wachowski, Lilly Wachowski",
        rating = 8.7,
        image = R.drawable.matrix
    ),
    Movie(
        title = "Fight Club",
        description = "An insomniac office worker and a soap salesman form an underground fight club.",
        director = "David Fincher",
        rating = 8.8,
        image = R.drawable.fight_club
    ),
    Movie(
        title = "The Shawshank Redemption",
        description = "Two imprisoned men bond over several years, finding solace and redemption through acts of common decency.",
        director = "Frank Darabont",
        rating = 9.3,
        image = R.drawable.shawshank_redemption
    ),
    Movie(
        title = "Interstellar",
        description = "A group of astronauts travels through a wormhole in search of a new home for humanity.",
        director = "Christopher Nolan",
        rating = 8.6,
        image = R.drawable.interstellar
    ),
    Movie(
        title = "Parasite",
        description = "A poor family schemes to become employed by a wealthy family and infiltrate their household.",
        director = "Bong Joon Ho",
        rating = 8.6,
        image = R.drawable.parasite
    )
)
