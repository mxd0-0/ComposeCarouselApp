package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.HorizontalUncontainedCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.deepBlue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                App()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(modifier: Modifier = Modifier) {

    val items = listOf(
        R.drawable.small,
        R.drawable.photo15,
        R.drawable.photo16,
        R.drawable.photo17,
        R.drawable.photo18,
        R.drawable.c23945e29f2e690f4767b9a51d2a9146,
        R.drawable.photo,
        R.drawable.photo123,
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(deepBlue)
            .padding(start = 16.dp, end = 16.dp)

    ) {
        Top()
        HorizontalMultiBrowseCarousel(
            itemSpacing = 5.dp,
            state = rememberCarouselState { items.count() },
            preferredItemWidth = 186.dp,
        ) { i ->
            val item = items[i]
            Image(
                modifier = Modifier
                    .maskClip(MaterialTheme.shapes.extraLarge),
                painter = painterResource(id = item),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        HorizontalDivider(thickness = 2.dp)
        Spacer(modifier = Modifier.height(16.dp))
        HorizontalUncontainedCarousel(
            state = rememberCarouselState { items.count() },
            itemWidth = 186.dp,
            itemSpacing = 8.dp,
            modifier = Modifier.fillMaxWidth()
        ) {
            val item = items[it]
            Image(
                painter = painterResource(id = item),
                modifier = Modifier.maskClip(MaterialTheme.shapes.extraLarge),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
        }

    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Top(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Text(
                "Carousel Test App",
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier.fillMaxWidth()
            )

        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = deepBlue,
        )

    )
}

