package com.raj.modulerarchitecture

import com.raj.sdklite.ControllerApplication
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
class ModulerApplication : ControllerApplication() {
    @Inject
    lateinit var controllerInterfaceImpl: ControllerInterfaceImpl

    override fun onCreate() {
        super.onCreate()

        controllerApplicationSingleton = this
        controllerInterface = controllerInterfaceImpl
    }
}

