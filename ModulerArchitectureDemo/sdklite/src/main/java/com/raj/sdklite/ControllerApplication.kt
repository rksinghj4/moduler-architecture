package com.raj.sdklite

import android.app.Application
//Each feature module will get this ControllerApplication, because sdklite, which is a controller module
//is added as dependencies in all the module.

abstract class ControllerApplication : Application() {
    lateinit var controllerApplicationSingleton: ControllerApplication
    lateinit var controllerInterface: ControllerInterface

    override fun onCreate() {
        super.onCreate()
    }

    fun singleton(): ControllerApplication = controllerApplicationSingleton
    fun fetchControllerInterface() = controllerInterface
}
