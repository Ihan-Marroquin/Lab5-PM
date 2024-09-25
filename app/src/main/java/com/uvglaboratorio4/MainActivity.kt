package com.uvglaboratorio4

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uvglaboratorio4.ui.theme.Laboratorio4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Column(
        modifier = modifier.fillMaxSize().padding(16.dp)
    ) {
        Button(onClick = {
            context.startActivity(Intent(context, InfoCampus::class.java))
        }) {
            Text(text = "Ir a Informacion sobre el campus")
        }

        Button(onClick = {
            context.startActivity(Intent(context, MyProf::class.java))
        }) {
            Text(text = "Ir a Mi perfil")
        }

        Button(onClick = {
            context.startActivity(Intent(context, ConfigProf::class.java))
        }) {
            Text(text = "Ir a Configuracion")
        }

        Button(onClick = {
            context.startActivity(Intent(context, EmergencyProf::class.java))
        }) {
            Text(text = "Ir a Contactos de emergencia")
        }


    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    Laboratorio4Theme {
        MainScreen()
    }
}
