package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import com.example.birthdaycard.ui.theme.BirthdayCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
//                    GreetingText(message = "Happy Birthday Sam!", from = "From Emma")
                    // String is found in app > res > values > strings.xml
                    GreetingImage(
                        message = getString(R.string.happy_birthday_text), from = getString(
                            R.string.from_text
                        )
                    )
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Composable // a composable function must have a modifier parameter
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center, // aligns entire component
        modifier = modifier
    ) { // passing in modifier to our column elements
        Text(
            text = message,
            fontSize = 100.sp, // sp means scalable pixels
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally), // aligns text container
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty) // importing image from res/drawable/..
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop, // makes image cover the entire screen
            alpha = 0.5F // lowers the opacity of the background image, makes it more transparent
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize() // fills entire size of the screen
                .padding(8.dp)
        )
    }

}

@Preview(
    // Passing multiple parameters to our annotation
    // These are not in reflected in our app, this only serves as a preview
    showBackground = true,
    showSystemUi = true, // shows preview when we run it on an android device
    name = "My Preview"
)
@Composable
fun BirthdayCardPreview() { // in pascal case and must describe component as a noun
    BirthdayCardTheme {
//        Greeting("Rein")
//        GreetingText(message = "Happy Birthday Rein!", from = "From Mercy")
        GreetingImage(message = "Happy Birthday Rein!", from = "From Mercy")
    }

}