package yusupov.noteapp

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext
import yusupov.noteapp.di.koinAppModule

class NoteApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        GlobalContext.startKoin {
            androidContext(this@NoteApplication)
            modules(koinAppModule)
        }
    }
}