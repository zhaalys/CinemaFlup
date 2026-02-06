package com.zhaalys.cinemaflup

import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLElement

fun main() {
    window.onload = {
        renderApp()
    }
}

fun renderApp() {
    val root = document.getElementById("root") as? HTMLElement ?: return
    
    // Create Layout
    val header = createHeader()
    val featuredSection = createFeaturedSection()
    val movieList = createMovieList()
    
    root.appendChild(header)
    root.appendChild(featuredSection)
    root.appendChild(movieList)
}

fun createHeader(): HTMLElement {
    val header = document.createElement("header") as HTMLElement
    header.className = "app-header"
    header.innerHTML = "<h1>CinemaFlup</h1><nav><ul><li>Home</li><li>Popular</li></ul></nav>"
    return header
}

fun createFeaturedSection(): HTMLElement {
    // Logic to render the big featured movie card
    val section = document.createElement("section") as HTMLElement
    section.className = "featured"
    return section
}

fun createMovieList(): HTMLElement {
    // Logic to render grid of movies
    val section = document.createElement("section") as HTMLElement
    section.className = "movie-grid"
    return section
}
