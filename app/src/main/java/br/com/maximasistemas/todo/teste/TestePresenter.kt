package br.com.maximasistemas.todo.teste

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log
import br.com.maximasistemas.arch.mvp.MvpPresenter

class TestePresenter : MvpPresenter<TesteView>() {

    var contador: Int = 0

    fun abc() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun fdf4() {
        Log.d("TestePresenter", "ON_CREATE")
        contador++
        Log.d("TestePresenter", contador.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun fdf() {
        Log.d("TestePresenter", "ON_START")
        contador++
        Log.d("TestePresenter", contador.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun fdf2() {
        Log.d("TestePresenter", "ON_RESUME")
        contador++
        Log.d("TestePresenter", contador.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun fdf3() {
        Log.d("TestePresenter", "ON_PAUSE")
        contador++
        Log.d("TestePresenter", contador.toString())
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun fdf5() {
        Log.d("TestePresenter", "ON_STOP")
        contador++
        Log.d("TestePresenter", contador.toString())
    }

}