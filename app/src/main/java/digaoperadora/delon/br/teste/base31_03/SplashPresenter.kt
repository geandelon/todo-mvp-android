package maximasistemas.com.br.todomxsmvp.ui.base31_03

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

class SplashPresenter : MvpPresenter<SplashView>() {

    var contador: Int = 0

    fun abc() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun fdf4() {
        Log.d("SplashPresenter", "ON_CREATE")
        contador++
        Log.d("SplashPresenter", contador.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun fdf() {
        Log.d("SplashPresenter", "ON_START")
        contador++
        Log.d("SplashPresenter", contador.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun fdf2() {
        Log.d("SplashPresenter", "ON_RESUME")
        contador++
        Log.d("SplashPresenter", contador.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun fdf3() {
        Log.d("SplashPresenter", "ON_PAUSE")
        contador++
        Log.d("SplashPresenter", contador.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun fdf5() {
        Log.d("SplashPresenter", "ON_STOP")
        contador++
        Log.d("SplashPresenter", contador.toString())
    }

}