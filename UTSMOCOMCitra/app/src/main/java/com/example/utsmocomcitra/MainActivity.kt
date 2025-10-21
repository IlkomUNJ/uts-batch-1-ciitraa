package com.example.utsmocomcitra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.utsmocomcitra.ui.theme.UTSMOCOMCitraTheme

object AppRoutes {
    const val DASHBOARD = "ContactScreen"
    const val ADD_CONTACT= "AddContact"
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UTSMOCOMCitraTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = AppRoutes.DASHBOARD
                ) {
                    composable(com.example.utsmocomcitra.AppRoutes.DASHBOARD) {
                        ContactScreen(
                            onAddContact = {
                                navController.navigate(AppRoutes.ADD_CONTACT)
                            }
                        )
                    }
                    composable(com.example.utsmocomcitra.AppRoutes.ADD_CONTACT) {
                        AddContact(navController = navController)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UTSMOCOMCitraTheme {
        Greeting("Android")
    }
}