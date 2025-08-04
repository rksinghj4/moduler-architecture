package com.raj.modulerarchitecture

import com.raj.sdklite.ControllerInterface
import com.raj.sdklite.PaymentFeatureInterface
import com.raj.sdklite.ProfileFeatureInterface
import javax.inject.Inject

class ControllerInterfaceImpl @Inject constructor(
    override val profileFeatureInterface: ProfileFeatureInterface,
    override val paymentFeatureInterface: PaymentFeatureInterface
) : ControllerInterface {
}