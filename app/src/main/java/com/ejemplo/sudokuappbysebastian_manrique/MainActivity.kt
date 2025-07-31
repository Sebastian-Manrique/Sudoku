package com.ejemplo.sudokuappbysebastian_manrique

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ejemplo.sudokuappbysebastian_manrique.ui.theme.SudokuAppBySebastianManriqueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding()
            ) {
                val textSample = remember { mutableStateOf("a") }
                Text(
                    text = textSample.value, modifier = Modifier.padding()
                )

                buttonFun(textSample)

            }
        }
    }

    @Composable
    fun buttonFun(textSample: MutableState<String>) {
        FilledTonalButton(onClick = {
            if (textSample.value == "hello world!") textSample.value = "push me!" else textSample.value =
                "hello world!"
        }) {
            Text("Filled")
        }

    }
}