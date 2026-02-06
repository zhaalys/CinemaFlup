package com.zhaalys.cinemaflup.model

data class Movie(
    val title: String,
    val year: String,
    val rating: Double,
    val imageUrl: String,
    val backdropUrl: String,
    val description: String
)

object MovieRepository {
    fun getMovies(): List<Movie> = listOf(
        Movie(
            "Dune: Part Two", "2024", 8.9,
            "https://image.tmdb.org/t/p/w500/1pdfLvkbY9ohJlCjQH2CZjjYVvJ.jpg",
            "https://image.tmdb.org/t/p/original/1pdfLvkbY9ohJlCjQH2CZjjYVvJ.jpg",
            "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge."
        ),
        Movie(
            "Oppenheimer", "2023", 8.6,
            "https://image.tmdb.org/t/p/w500/8Gxv8gSFCU0XGDykEGv7zR1n2ua.jpg",
            "https://image.tmdb.org/t/p/original/fm6KqXpk3M2HVveHwCrBSSBaB0.jpg",
            "The story of J. Robert Oppenheimer's role in the development of the atomic bomb."
        ),
        Movie(
            "Godzilla x Kong", "2024", 7.2,
            "https://image.tmdb.org/t/p/w500/tM26baW1bL54BXnrbd2N9U0vC15.jpg",
            "https://image.tmdb.org/t/p/original/cwv50B73QxR58nI3y5TjYjI4sWz.jpg",
            "Kong and Godzilla fight against a colossal undiscovered threat."
        )
    )
}
