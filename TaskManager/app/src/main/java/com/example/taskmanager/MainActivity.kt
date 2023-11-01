package com.example.taskmanager

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    TaskCompleteScreen(
                        mainText = getString(R.string.all_tasks_completed), subText = getString(
                            R.string.nice_work
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun TaskCompleteScreen(mainText: String, subText: String, modifier: Modifier = Modifier) {

    val image = painterResource(R.drawable.ic_task_completed)

    Column(
        verticalArrangement = Arrangement.Center, modifier = modifier
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = mainText,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(0.dp, 24.dp, 0.dp, 8.dp)
        )
        Text(
            text = subText,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

    }
}

@Preview(
    showBackground = true, showSystemUi = true, name = "Task Manager"
)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        TaskCompleteScreen(mainText = "All tasks completed", subText = "Nice work!")
    }

}