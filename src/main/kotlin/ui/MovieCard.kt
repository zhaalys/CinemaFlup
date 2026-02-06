package com.zhaalys.cinemaflup.ui

import kotlinx.browser.document
import org.w3c.dom.HTMLElement
import com.zhaalys.cinemaflup.model.Movie

fun createMovieCard(movie: Movie): HTMLElement {
    val card = document.createElement("div") as HTMLElement
    
    // Inline styling for the card
    card.style.apply {
        background = "rgba(255, 255, 255, 0.05)"
        border = "1px solid rgba(255,255,255,0.1)"
        borderRadius = "16px"
        overflow = "hidden"
        cursor = "pointer"
        transition = "transform 0.3s"
    }

    // Hover effect logic (Kotlin JS)
    card.onmouseenter = { card.style.transform = "translateY(-10px)" }
    card.onmouseleave = { card.style.transform = "translateY(0)" }

    card.innerHTML = """
        <img src="${movie.imageUrl}" style="width:100%; height:280px; object-fit:cover;">
        <div style="padding:12px;">
            <div style="font-weight:bold; color:white; font-size:16px; margin-bottom:4px;">${movie.title}</div>
            <div style="font-size:12px; color:#94a3b8; display:flex; justify-content:space-between;">
                <span>${movie.year}</span>
                <span style="color:#ffd700;">★ ${movie.rating}</span>
            </div>
        </div>
    """.trimIndent()
    return card
}
