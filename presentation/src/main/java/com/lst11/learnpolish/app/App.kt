package com.lst11.learnpolish.app

import android.app.Application
import com.gmail.superarch.inject.DomainModule
import com.lst11.learnpolish.inject.AppComponent
import com.lst11.learnpolish.inject.DaggerAppComponent


class App : Application() {

    companion object {
        lateinit var instance: App
        @JvmStatic lateinit var appComponent: AppComponent
    }

    init {
        instance = this

    }

    override fun onCreate() {
        appComponent = DaggerAppComponent.builder()
                .domainModule(DomainModule(this))
                .build()
//        appComponent.inject(this)
        super.onCreate()


//        Fabric.with(this, Crashlytics())
    }
}