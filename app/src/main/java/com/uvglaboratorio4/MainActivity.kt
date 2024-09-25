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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.uvglaboratorio4.ui.theme.Laboratorio4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                val navController = rememberNavController()
                MainScreen(navController)
            }
        }
    }
}

@Composable
fun MainScreen(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = { navController.navigate("infoCampus") }) {
                    Text(text = "Ir a Información sobre el campus")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { navController.navigate("myProf") }) {
                    Text(text = "Ir a Mi perfil")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { navController.navigate("configProf") }) {
                    Text(text = "Ir a Configuración")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { navController.navigate("emergencyProf") }) {
                    Text(text = "Ir a Contactos de emergencia")
                }
            }
        }

        composable("infoCampus") { InfoCampusScreen() }
        composable("myProf") { MyProfScreen() }
        composable("configProf") { ConfigProfScreen() }
        composable("emergencyProf") { EmergencyProfScreen() }
    }
}



@Composable
fun InfoCampusScreen(modifier: Modifier = Modifier) {
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

@Composable
fun MyProfScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Campus Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(300.dp)
                .width(500.dp)
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .clip(RoundedCornerShape(8.dp))
        )
        Text(
            text = "Ihan Gilberto Alexander Marroquin Sequen",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 0.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "Campus Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(400.dp)
                .width(400.dp)
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .clip(RoundedCornerShape(8.dp))
        )
    }
}

@Composable
fun ConfigProfScreen(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.img_2),
        contentDescription = "Campus Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .height(500.dp)
            .width(400.dp)
            .fillMaxWidth()
            .padding(bottom = 16.dp)
            .clip(RoundedCornerShape(8.dp))
    )
}

@Composable
fun EmergencyProfScreen(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.img_3),
        contentDescription = "Campus Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .height(560.dp)
            .width(425.dp)
            .fillMaxWidth()
            .padding(bottom = 16.dp)
            .clip(RoundedCornerShape(8.dp))
    )
}
