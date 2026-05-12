# Экзамен
## Пыханов Сергей ИП-235
## Вариант №16
## Задание: Разместите LinearProgressIndicator и две кнопки: «+10%» и «−10%». Прогресс-бар заполняется от 0 до 100% с шагом 10%. Нельзя выйти за границы диапазона. Текущий процент отображается текстом над прогресс-баром.

```kt
package com.example.ekz_ps

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
```
## Скриншоты работы приложения

<div align="center">

<b></b><br>
<img src="./images/1.png" width="250"/>

<br><br>

<b>Значение по умолчанию</b><br>
<img src="./exz16ip235/images/1.jpg" width="250"/>

<br>Плюс 20%<br>

<b></b><br>
<img src="./exz16ip235/images/2.jpg" width="250"/>

<br>Минус 10%<br>

<b>Сброс</b><br>
<img src="./exz16ip235/images/3.jpg" width="250"/>

</div>
