package br.com.maximasistemas.todo.util

import android.app.Application
import android.util.Log
import br.com.maximasistemas.todo.BuildConfig
import cat.ereza.customactivityoncrash.config.CaocConfig
import com.crashlytics.android.Crashlytics
import timber.log.Timber

/**
 *
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this

        CaocConfig.Builder.create().apply()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(CrashReportingTree())
        }
    }

    companion object {
        lateinit var instance: App private set
    }

    class CrashReportingTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            if (priority == Log.VERBOSE || priority == Log.DEBUG) {
                return
            }

            Crashlytics.log(priority, tag, message)

            if (t != null) {
                Crashlytics.logException(t)
            }
        }
    }
}