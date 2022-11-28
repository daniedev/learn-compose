package github.daniedev.learncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import github.daniedev.learncompose.ui.starterapp.MyApp
import github.daniedev.learncompose.ui.theme.LearncomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearncomposeTheme {
                MyApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}