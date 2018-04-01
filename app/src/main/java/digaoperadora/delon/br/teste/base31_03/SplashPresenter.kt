package maximasistemas.com.br.todomxsmvp.ui.base31_03

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

class SplashPresenter : MvpPresenter<SplashView>() {
    override val TAG: String = SplashPresenter::class.java.simpleName


    var contador: Int = 0

    fun abc() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun fdf4() {
        Log.d(TAG, "ON_CREATE")
        contador++
        Log.d(TAG, contador.toString())
        Log.d(TAG, "isViewAttached: ${isViewAttached.toString()}" )
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun fdf() {
        Log.d(TAG, "ON_START")
        contador++
        Log.d(TAG, contador.toString())
        Log.d(TAG, "isViewAttached: ${isViewAttached.toString()}" )
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun fdf2() {
        Log.d(TAG, "ON_RESUME")
        contador++
        Log.d(TAG, contador.toString())
        Log.d(TAG, "isViewAttached: ${isViewAttached.toString()}" )
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun fdf3() {
        Log.d(TAG, "ON_PAUSE")
        contador++
        Log.d(TAG, contador.toString())
        Log.d(TAG, "isViewAttached: ${isViewAttached.toString()}" )
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun fdf5() {
        Log.d(TAG, "ON_STOP")
        contador++
        detachView()
        Log.d(TAG, contador.toString())
        Log.d(TAG, "isViewAttached: ${isViewAttached.toString()}" )
    }

}