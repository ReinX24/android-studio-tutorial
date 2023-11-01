package com.example.composequadrant

import android.os.Bundle
import android.util.DisplayMetrics
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantScreen(
                        "Text composable",
                        "Displays text and follows the recommended Material Design guidelines.",
                        "Image composable",
                        "Creates a composable that lays out and draws a given Painter class object.",
                        "Row composable",
                        "A layout composable that places its children in a horizontal sequence.",
                        "Column composable",
                        "A layout composable that places its children in a vertical sequence."
                    )
                }
            }
        }
    }
}

@Composable
fun QuadrantScreen(
    textComposable: String,
    textComposableBody: String,
    imageComposable: String,
    imageComposableBody: String,
    rowComposable: String,
    rowComposableBody: String,
    columnComposable: String,
    columnComposableBody: String,
    modifier: Modifier = Modifier
) {
    Column {


        Row {
            Box(
                modifier = Modifier.background(Color(0xFFEADDFF))
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .size(200.dp, 300.dp)
                        .padding(16.dp)
                ) {
                    Text(
                        text = textComposable,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(0.dp, 0.dp, 0.dp, 16.dp)
                    )
                    Text(
                        text = textComposableBody,
                        textAlign = TextAlign.Justify,
                    )
                }
            }

            Box(
                modifier = Modifier.background(Color(0xFFD0BCFF))
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .size(200.dp, 300.dp)
                        .padding(16.dp)
                ) {
                    Text(
                        text = imageComposable,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(0.dp, 0.dp, 0.dp, 16.dp)
                    )
                    Text(
                        text = imageComposableBody,
                        textAlign = TextAlign.Justify
                    )
                }
            }

        }

        Row {

            Box(
                modifier = Modifier.background(Color(0xFFB69DF8))
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .size(200.dp, 300.dp)
                        .padding(16.dp)
                ) {
                    Text(
                        text = rowComposable,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(0.dp, 0.dp, 0.dp, 16.dp)
                    )
                    Text(
                        text = rowComposableBody,
                        textAlign = TextAlign.Justify
                    )
                }
            }

            Box(
                modifier = Modifier.background(Color(0xFFF6EDFF))
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .size(200.dp, 300.dp)
                        .padding(16.dp)
                ) {
                    Text(
                        text = columnComposable,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(0.dp, 0.dp, 0.dp, 16.dp)
                    )
                    Text(
                        text = columnComposableBody,
                        textAlign = TextAlign.Justify
                    )
                }
            }

        }

    }


}

@Preview(
    showBackground = true, showSystemUi = true, name = "Compose quadrant"
)
@Composable
fun QuadrantScreenPreview() {
    ComposeQuadrantTheme {
        QuadrantScreen(
            "Text composable",
            "Displays text and follows the recommended Material Design guidelines.",
            "Image composable",
            "Creates a composable that lays out and draws a given Painter class object.",
            "Row composable",
            "A layout composable that places its children in a horizontal sequence.",
            "Column composable",
            "A layout composable that places its children in a vertical sequence."
        )
    }
}