package com.raj.paymentfeature

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import com.raj.sdklite.ControllerApplication

class PaymentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Payment")

                Button(onClick = {
                    ControllerApplication.singleton().controllerInterface
                        .profileFeatureInterface.showProfileScreen(this@PaymentActivity)
                }) {
                    Text(text = "GoTo: Profile")
                }
            }
        }
    }

    companion object {
        fun show(fromActivity: Activity) {
            val intent = Intent(fromActivity, PaymentActivity::class.java)
            fromActivity.startActivity(intent)
        }
    }
}