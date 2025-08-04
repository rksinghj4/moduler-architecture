package com.raj.sdklite

import android.app.Application

//Each feature module will get this ControllerApplication, because sdklite, which is a controller module
//is added as dependencies in all the module.

open class ControllerApplication : Application() {
    lateinit var controllerInterface: ControllerInterface

    override fun onCreate() {
        super.onCreate()
    }

    fun fetchControllerInterface() = controllerInterface

    companion object {
        lateinit var controllerApplicationSingleton: ControllerApplication
        fun singleton(): ControllerApplication = controllerApplicationSingleton
    }
}
