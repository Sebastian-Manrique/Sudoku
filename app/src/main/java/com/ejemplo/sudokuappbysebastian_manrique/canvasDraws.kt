package com.ejemplo.sudokuappbysebastian_manrique

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

@Composable
fun CanvasDraw() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawRect(
            color = Color.Magenta
        )
    }
}

fun numberLogiscs(){
    val random = List(10) { Random.nextInt(0, 10) }
    println("This are the numbers $random")
}