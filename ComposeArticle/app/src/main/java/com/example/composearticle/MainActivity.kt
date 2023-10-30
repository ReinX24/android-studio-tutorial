package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleImage(
                        title = getString(R.string.tutorial_title),
                        paragraphOne = getString(R.string.paragraph_one_text),
                        paragraphTwo = getString(R.string.paragraph_two_text)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleText(
    title: String,
    paragraphOne: String,
    paragraphTwo: String,
    modifier: Modifier = Modifier
) {
    Column {
        Text(
            text = title,
            fontSize = 16.sp,
            modifier = Modifier.padding(24.dp)
        )
        Text(
            text = paragraphOne,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = paragraphTwo,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun ArticleImage(
    title: String,
    paragraphOne: String,
    paragraphTwo: String,
    modifier: Modifier = Modifier
) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null
        )
        ArticleText(
            title = title,
            paragraphOne = paragraphOne,
            paragraphTwo = paragraphTwo
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Compose Article")
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        ArticleImage(
            title = "JetPack Compose Tutorial",
            paragraphOne = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            paragraphTwo = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
        )
    }
}