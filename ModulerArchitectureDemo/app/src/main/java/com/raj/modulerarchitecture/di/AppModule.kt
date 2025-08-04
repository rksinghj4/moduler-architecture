package com.raj.modulerarchitecture.di

import com.raj.modulerarchitecture.ControllerInterfaceImpl
import com.raj.paymentfeature.PaymentFeatureInterfaceImpl
import com.raj.profilefeature.ProfileFeatureInterfaceImpl
import com.raj.sdklite.ControllerInterface
import com.raj.sdklite.PaymentFeatureInterface
import com.raj.sdklite.ProfileFeatureInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

//In app module - we have added followings:
//1. all the feature modules
//2. sdklite module(i.e Controller module) which has interfaces for each module and one ControllerInterface.
//3. Each feature module will have sdklite (i.e Controller module) module as dependency in their build.gradle.kts file
@InstallIn(SingletonComponent::class)
@Module
abstract class AppModule {
    //PaymentFeatureInterface - part of sdklite, which act as controller module
    //PaymentFeatureInterfaceImpl - part of PaymentFeature

    @Binds
    abstract fun providePaymentFeatureInterfaceImpl(
        paymentFeatureInterfaceImpl: PaymentFeatureInterfaceImpl
    ): PaymentFeatureInterface

    //ProfileFeatureInterface - part of sdklite, which act as controller module
    //ProfileFeatureInterfaceImpl - part of ProfileFeature module
    @Binds
    abstract fun provideProfileFeatureInterfaceImpl(
        profileFeatureInterfaceImpl: ProfileFeatureInterfaceImpl
    ): ProfileFeatureInterface

    //ControllerInterface - part of sdklite, which act as controller module
    //ControllerInterfaceImpl -  is part of app module
    @Binds
    abstract fun provideControllerInterfaceImpl(controllerInterfaceImpl: ControllerInterfaceImpl): ControllerInterface

}