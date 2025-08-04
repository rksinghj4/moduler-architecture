package com.raj.sdklite
//ControllerInterface in Controller module(here sdklite), will act as communicator between all other modules
//ControllerInterface will have all other interfaces as member.
interface ControllerInterface {
    val profileFeatureInterface: ProfileFeatureInterface
    val paymentFeatureInterface: PaymentFeatureInterface

    //Add other required functions

}