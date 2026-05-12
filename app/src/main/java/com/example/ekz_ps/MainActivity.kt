import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var progress by remember { mutableStateOf(0f) } // 0..1

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Text(text = "Прогресс: ${(progress * 100).toInt()}%")

                Spacer(modifier = Modifier.height(16.dp))


                LinearProgressIndicator(
                    progress = progress,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(24.dp))


                Row {
                    Button(onClick = {
                        if (progress < 1f) {
                            progress += 0.1f
                        }
                    }) {
                        Text("+10%")
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Button(onClick = {
                        if (progress > 0f) {
                            progress -= 0.1f
                        }
                    }) {
                        Text("-10%")
                    }
                }
            }
        }
    }
}