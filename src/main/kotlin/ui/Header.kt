package com.zhaalys.cinemaflup.ui

import kotlinx.browser.document
import org.w3c.dom.HTMLElement

fun createHeader(): HTMLElement {
    val header = document.createElement("header") as HTMLElement
    // Glassmorphism Styles applied via code
    header.style.apply {
        display = "flex"
        justifyContent = "space-between"
        alignItems = "center"
        padding = "20px 40px"
        background = "rgba(15, 23, 42, 0.8)"
        setProperty("backdrop-filter", "blur(10px)")
        position = "sticky"
        top = "0"
        zIndex = "100"
        borderBottom = "1px solid rgba(255,255,255,0.1)"
    }
    
    header.innerHTML = """
        <h1 style="color:white; margin:0; font-family: sans-serif;">CinemaFlup</h1>
        <nav>
            <ul style="list-style:none; display:flex; gap:20px; color:#94a3b8; font-family: sans-serif;">
                <li style="cursor:pointer; color: #e11d48; font-weight:bold;">Home</li>
                <li style="cursor:pointer;">Popular</li>
                <li style="cursor:pointer;">Series</li>
            </ul>
        </nav>
    """.trimIndent()
    
    return header
}
