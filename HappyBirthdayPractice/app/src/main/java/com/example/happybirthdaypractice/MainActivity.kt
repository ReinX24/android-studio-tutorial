package com.example.happybirthdaypractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthdaypractice.ui.theme.HappyBirthdayPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayPracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        greeting = getString(R.string.happy_birthday_text), from = getString(
                            R.string.from_text
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(greeting: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = greeting,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun GreetingImage(greeting: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop, // makes image cover the entire screen
        alpha = 0.5F // lowers the opacity of the background image, makes it more transparent
    )
    GreetingText(
        greeting = greeting,
        from = from,
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Birthday Card Practice"
)
@Composable
fun GreetingPreview() {
    HappyBirthdayPracticeTheme {
        GreetingImage("Happy Birthday Sam!", "From Emma")
    }
}