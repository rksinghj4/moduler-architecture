package com.raj.profilefeature

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.raj.sdklite.ControllerApplication

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Payment Screen")

                Button(onClick = {
                    ControllerApplication.singleton().controllerInterface
                        .paymentFeatureInterface.showPaymentScreen(this@ProfileActivity)
                }) {
                    Text(text = "GoTo: Payment")
                }
            }
        }
    }

    companion object {
        fun show(fromActivity: Activity) {
            val intent = Intent(fromActivity, ProfileActivity::class.java)
            fromActivity.startActivity(intent)
        }
    }
}