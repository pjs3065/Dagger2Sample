package kr.co.pv.dagger2demo

import android.app.Application
import kr.co.pv.dagger2demo.di.component.AppComponent
import kr.co.pv.dagger2demo.di.component.DaggerAppComponent
import kr.co.pv.dagger2demo.di.module.AppModule

class App : Application() {
    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this, AppModule())
    }
}