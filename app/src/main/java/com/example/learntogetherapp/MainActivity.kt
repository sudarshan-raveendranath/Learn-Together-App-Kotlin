package com.example.learntogetherapp

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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogetherapp.ui.theme.LearnTogetherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun ComposeArticleApp () {
    PageContent(
        title = stringResource(R.string.title),
        paragraph1 = stringResource(R.string.para1),
        paragraph2 = stringResource(R.string.para2),
        imagePainter = painterResource(R.drawable.bg_compose_background)
    )
}

@Composable
fun PageContent (title : String,
                 paragraph1 : String,
                 paragraph2 :String,
                 modifier: Modifier = Modifier,
                 imagePainter : Painter
) {
    Column {

        Image(
            painter = imagePainter,
            contentDescription = null,
        )

        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = paragraph1,
            fontSize = 16.sp,
            textAlign = Justify,
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = paragraph2,
            fontSize = 16.sp,
            textAlign = Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherAppTheme {
        ComposeArticleApp()
    }
}