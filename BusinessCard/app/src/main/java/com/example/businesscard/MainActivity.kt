package com.example.businesscard

import android.graphics.Typeface
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun ComposeBusinessCardApp() {
    ComposableBusinessCard()
}

@Composable
fun ComposableBusinessCard() {
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color(210, 231, 212))
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            NameAndTitleCard()
        }

        Row(
            Modifier
                .fillMaxWidth()
                .weight(0.20f)
        ) {
            ContactInfoCard()
        }

    }
}

@Composable
fun NameAndTitleCard() {
    Column(
        Modifier
            .padding(16.dp)
            .background(Color(0xFFEADDFF))
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val image = painterResource(id = R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            Modifier.background(Color(7,48,66))
                .width(160.dp)
        )
        Text(
            text = stringResource(id = R.string.full_name),
            fontFamily = FontFamily(Typeface.MONOSPACE),
            fontSize = 48.sp,
            color = Color(7,48,66)
        )
        Text(
            text = stringResource(id = R.string.person_title),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(23,111,68)
        )
    }
}

@Composable
fun ContactInfoCard() {
    Column(
        Modifier
            .padding(16.dp)
            .background(Color(0xFFEADDFF))
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row {
            Column {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = "Phone Icon"
                )
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Share Icon"
                )
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email Icon"
                )
            }

            Column {
                Text(
                    text = stringResource(id = R.string.contact_number)
                )
                Text(
                    text = stringResource(id = R.string.social_media_handle)
                )
                Text(
                    text = stringResource(id = R.string.person_email)
                )
            }
        }

        // TODO: Remove Later
        /*Row {
            Icon (
                imageVector = Icons.Default.Call,
                contentDescription = "Phone Icon"
            )
            Text(
                text = stringResource(id = R.string.contact_number)
            )
        }

        Row {
            Icon (
                imageVector = Icons.Default.Share,
                contentDescription = "Share Icon"
            )
            Text(
                text = stringResource(id = R.string.social_media_handle)
            )
        }

        Row {
            Icon (
                imageVector = Icons.Default.Email,
                contentDescription = "Email Icon"
            )
            Text(
                text = stringResource(id = R.string.person_email)
            )
        }*/

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true, name = "Business Card")
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        ComposeBusinessCardApp()
    }
}