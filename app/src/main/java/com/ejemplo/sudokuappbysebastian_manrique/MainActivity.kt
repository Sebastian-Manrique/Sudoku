package com.ejemplo.sudokuappbysebastian_manrique

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ejemplo.sudokuappbysebastian_manrique.ui.theme.SudokuAppBySebastianManriqueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SudokuAppBySebastianManriqueTheme {
                Column {
                    SudokuAppBySebastianManriqueTheme {
                        Board()
                        numberLogiscs()
                    }
                }
            }
        }
    }

    @Composable
    fun Board() {
        Column(
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.background)
                .border(
                    border = BorderStroke(
                        2.dp,
                        MaterialTheme.colorScheme.onBackground
                    )
                )
                .padding(top = 145.dp)
                .absolutePadding(
                    left = 8.dp, right = 8.dp
                )

        ) {
            for (columns in 1..9) {
                ButtonInRow()
            }
        }
    }

    @Composable
    fun ButtonInRow() {
        LazyVerticalGrid(
            columns = GridCells.Fixed(9),
            content = {
                items(9) { i ->
                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .padding(1.dp)
                            .background(Color.White)
                            .clip(RectangleShape)
                            .clickable { callToast() }
                    )
                    { Text("${i + 1}") }

                }
            }
        )
    }

    @Composable
    fun SolveNumbersButtons() {
        Row( //Use LazyVerticalGrid
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            for (numbers in 1..9) {
                ButtonInRow2(numbers)
//                if (numbers != 9) {
//                    Spacer(Modifier.width(10.dp))
//                }
            }
        }
    }

    @Composable
    private fun ButtonInRow2(numbers: Int) {
//        Button(
//            onClick = { callToast() },
//            shape = RoundedCornerShape(15.dp),
//            colors = ButtonColors(
//                MaterialTheme.colorScheme.secondary,
//                contentColor = Color.White,
//                disabledContainerColor = Color.Gray,
//                disabledContentColor = Color.DarkGray
//            ),
//            modifier = Modifier.width(30.dp).height(70.dp)
//        ) {
//            Text(
//                "$numbers",
//                color = Color.Black,
//                style = MaterialTheme.typography.bodySmall
//            )
//        }
        Button(
            onClick = { callToast() }, shape = RectangleShape,
            modifier = Modifier
                .padding(1.dp)
                .height(60.dp)
                .width(40.dp)
        ) {
            Text(
                "$numbers", fontSize = 1.sp
            )
        }
    }

    private fun callToast() {
        Toast.makeText(this@MainActivity, "The button was pressed!", Toast.LENGTH_SHORT).show()
    }

    @Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
    @Composable
    fun SeePreview() {
        SudokuAppBySebastianManriqueTheme {
            CanvasDraw()
        }
    }
}

