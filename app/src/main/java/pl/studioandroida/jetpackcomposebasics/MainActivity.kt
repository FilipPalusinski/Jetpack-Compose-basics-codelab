package pl.studioandroida.jetpackcomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.studioandroida.jetpackcomposebasics.ui.theme.JetpackComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp(){
    JetpackComposeBasicsTheme {
        androidx.compose.material.Surface(color = Color.Yellow) {
            Greeting("Android")
        }

    }
}

@Composable
fun Greeting(name: String) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(24.dp)
        )
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}