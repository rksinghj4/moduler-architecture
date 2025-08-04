package com.raj.modulerarchitecture

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.raj.modulerarchitecture.ui.theme.ModulerArchitectureTheme
import com.raj.sdklite.ControllerApplication

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ModulerArchitectureTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        modifier = Modifier.padding(innerPadding),
                        fromActivity = this
                    )
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier, fromActivity: Activity) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(modifier = Modifier.wrapContentSize(),
            onClick = {
                ControllerApplication.singleton().controllerInterface
                    .paymentFeatureInterface.showPaymentScreen(fromActivity)
            }) {
            Text(
                text = "Profile Module",
                modifier = modifier
            )
        }

        Button(
            modifier = Modifier.wrapContentSize(),
            onClick = {
                ControllerApplication.singleton().controllerInterface
                    .profileFeatureInterface.showProfileScreen(fromActivity)
            }) {
            Text(
                text = "Payment Module",
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ModulerArchitectureTheme {
        //MainScreen()
    }
}