package com.uvglaboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uvglaboratorio4.ui.theme.Laboratorio4Theme
import androidx.compose.ui.draw.clip


class InfoCampus : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CampusInfoScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CampusInfoScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Campus Central",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 12.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.campus_image),
            contentDescription = "Campus Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .clip(RoundedCornerShape(8.dp))
        )
        Text(
            text = "Destacados",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Row (
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp),
        ){
            Image(
                painter = painterResource(id = R.drawable.campus_image2),
                contentDescription = "Campus Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(145.dp)
                    .width(170.dp)
                    .fillMaxWidth()
                    .padding(bottom = 12.dp)
                    .clip(RoundedCornerShape(5.dp))
            )
            Image(
                painter = painterResource(id = R.drawable.campus_image3),
                contentDescription = "Campus Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(145.dp)
                    .width(170.dp)
                    .fillMaxWidth()
                    .padding(bottom = 12.dp)
                    .clip(RoundedCornerShape(5.dp))
            )
        }

        Text(
            text = "Servicios y recursos",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Row (
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp),
        ){
            Image(
                painter = painterResource(id = R.drawable.campus_image4),
                contentDescription = "Campus Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(145.dp)
                    .width(170.dp)
                    .fillMaxWidth()
                    .padding(bottom = 12.dp)
                    .clip(RoundedCornerShape(5.dp))
            )
            Image(
                painter = painterResource(id = R.drawable.campus_image5),
                contentDescription = "Campus Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(145.dp)
                    .width(170.dp)
                    .fillMaxWidth()
                    .padding(bottom = 12.dp)
                    .clip(RoundedCornerShape(5.dp))
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun CampusInfoPreview() {
    Laboratorio4Theme {
        CampusInfoScreen()
    }
}