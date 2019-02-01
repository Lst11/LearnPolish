package com.lst11.learnpolish.app

import android.app.Application
import android.support.v7.app.AppCompatDelegate




class App : Application() {

    companion object {

        lateinit var instance: App
//        @JvmStatic lateinit var appComponent: AppComponent
    }

    init {
        instance = this
    }

    override fun onCreate() {
//        appComponent.inject(this)

        super.onCreate()
//        appComponent = DaggerAppComponent.builder()
//                .domainModule(DomainModule(this))
//                .build()

//        Fabric.with(this, Crashlytics())
    }
}