package com.example.panalsuite.repository

import com.example.panalsuite.R
import com.example.panalsuite.model.MenuItem

class menuRepository {
    fun getMenu():List<MenuItem> = listOf(
        MenuItem(1,"Cafe americano", "Cafe negro suave, 250ml", 1800) ,
        MenuItem(2,"Cafe expresso", "Cafe negro suave, 80ml", 1500),
        MenuItem(3,"Cafe capucciono", "Cafe negro suave, 300ml", 2500)


    )
}
