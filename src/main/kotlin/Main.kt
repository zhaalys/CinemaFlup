package com.zhaalys.cinemaflup

import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLElement
import com.zhaalys.cinemaflup.ui.createHeader
import com.zhaalys.cinemaflup.ui.createMovieCard
import com.zhaalys.cinemaflup.model.MovieRepository

fun main() {
    window.onload = {
        setupGlobalStyles()
        renderApp()
    }
}

fun setupGlobalStyles() {
    val style = document.createElement("style")
    style.innerHTML = """
        body {
            margin: 0;
            background-color: #0f172a; /* Deep Dark Blue */
            font-family: 'Inter', system-ui, sans-serif;
            color: white;
        }
    """.trimIndent()
    document.head?.appendChild(style)
}

fun renderApp() {
    val root = document.getElementById("root") as? HTMLElement ?: run {
        // Fallback if root not found, auto-create body content
        val body = document.body ?: return
        val appRoot = document.createElement("div") as HTMLElement
        appRoot.id = "root"
        body.appendChild(appRoot)
        appRoot
    }

    // 1. Header
    root.appendChild(createHeader())

    // 2. Movie Grid Container
    val grid = document.createElement("div") as HTMLElement
    grid.style.apply {
        display = "grid"
        gridTemplateColumns = "repeat(auto-fill, minmax(180px, 1fr))"
        gap = "24px"
        padding = "40px"
    }

    // 3. Render Movies
    val movies = MovieRepository.getMovies()
    movies.forEach { movie ->
        grid.appendChild(createMovieCard(movie))
    }

    // Title for the section
    val title = document.createElement("h2") as HTMLElement
    title.innerText = "Popular Now"
    title.style.apply {
        padding = "0 40px"
        borderLeft = "4px solid #e11d48"
        marginLeft = "40px"
    }

    root.appendChild(title)
    root.appendChild(grid)
}
