package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme


class MainActivity : ComponentActivity() {
    // This is the main function of Android Program
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Calling functions for our Android program
                    Greeting("Rein")
                }
            }
        }
    }
}

// Functions that we will be using in our Android program must start with @Composable
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Setting the background color of our text
    Surface(color = Color.Cyan) {
        Text(
            // To surround with a container, highlight first line, alt + enter, surround with widget
            // and surround with container.
            // Replace container with Surface() for this demo
            text = "Hi, my name is $name!",
            // Adding padding to our text container
            modifier = modifier.padding(24.dp)
        )
    }
}

// This will show a preview of a function when we split the screen
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Rein")
    }
}