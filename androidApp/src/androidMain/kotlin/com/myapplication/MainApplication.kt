package com.myapplication

import android.app.Application
import di.androidModule
import di.champModule
import di.commonModule
import di.greetingModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            androidLogger()
            modules(
                commonModule,
                androidModule,
                greetingModule,
                champModule
            )
        }
    }
}
