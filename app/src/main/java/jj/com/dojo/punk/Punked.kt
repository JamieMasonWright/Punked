package jj.com.dojo.punk

import android.app.Application
import jj.com.dojo.punk.di.*
import com.facebook.drawee.backends.pipeline.Fresco
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Punked : Application() {

    override fun onCreate() {
        super.onCreate()

        Fresco.initialize(this)

        startKoin {
            androidContext(this@Punked)
            modules(listOf(repositoriesModule, viewModelModule, useCasesModule, sharedPreferences))
        }
    }
}