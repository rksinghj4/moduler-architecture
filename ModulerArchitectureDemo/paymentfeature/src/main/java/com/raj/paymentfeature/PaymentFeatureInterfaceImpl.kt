package com.raj.paymentfeature

import android.app.Activity
import com.raj.sdklite.PaymentFeatureInterface
import javax.inject.Inject

class PaymentFeatureInterfaceImpl @Inject constructor() : PaymentFeatureInterface {
    override fun showPaymentScreen(fromActivity: Activity) {
        PaymentActivity.show(fromActivity)
    }
}