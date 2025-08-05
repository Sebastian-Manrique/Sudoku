package com.ejemplo.sudokuappbysebastian_manrique

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ejemplo.sudokuappbysebastian_manrique.ui.theme.SudokuAppBySebastianManriqueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SudokuAppBySebastianManriqueTheme {
                Column {
                    SudokuAppBySebastianManriqueTheme {
                        Board()
                        SolveButton()
                    }
                }
            }
        }
    }

    @Composable
    fun Board() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier/*This is the background color for the app for now*/
                .background(color = MaterialTheme.colorScheme.background)
                .fillMaxWidth()
                .height(640.dp)
                .padding(
                    top = 50.dp
                )
                .absolutePadding(
                    left = 8.dp, right = 8.dp
                )
                .border(
                    border = BorderStroke(2.dp, MaterialTheme.colorScheme.onBackground)
                )
        ) {
            for (i in 1..9) {
                Row(
                    verticalAlignment = Alignment.Top
                ) {
                    for (j in 1..9) {
//                    if (i == 1 || i == 9) {
//                        ButtonInRow(true)
//                    }
                        ButtonInRow(false)
                    }
                }
            }
        }
    }

    @Composable
    fun ButtonInRow(isBorder: Boolean) {
        Button(
            onClick = {/*TODO*/ }, shape = RectangleShape,
            modifier = Modifier
                .padding(1.dp)
                .height(50.dp)
                .width(40.dp)
            //If isBorder == true not draw border
            //Else draw border

        ) {
            Text(" ")

        }
    }

    fun Modifier.thenIf(condition: Boolean, modifier: Modifier.() -> Modifier) =
        if (condition) {
            then(modifier(Modifier))
        } else {
            this
        }

    @Composable
    fun SolveButton() {
        Button(
            onClick = { callToast() },
            modifier = Modifier/*This is the background color for the button app for now*/
                .background(
                    color = MaterialTheme.colorScheme.background
                )
                .padding(top = 15.dp, bottom = 50.dp)
                .fillMaxSize()
                .absolutePadding(
                    left = 8.dp, right = 8.dp
                )
        ) {
            Text(
                "Solve",
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.displayLarge
            )
        }
    }

    private fun callToast() {
        Toast.makeText(this@MainActivity, "The button was pressed!", Toast.LENGTH_SHORT).show()
    }

    @Preview(
        showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES
    )
    @Composable
    fun SeePreview() {
        SudokuAppBySebastianManriqueTheme {
            Column {
                Board()
                Text(
                    "This is a preview!1!1",
                    modifier = Modifier.background(color = Color.Black),
                    color = MaterialTheme.colorScheme.onBackground,
                    style = MaterialTheme.typography.bodySmall,
                )
                SolveButton()
            }
        }
    }
}

