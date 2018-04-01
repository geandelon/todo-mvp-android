package maximasistemas.com.br.todomxsmvp.ui.base31_03

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.ViewModel

/**
 * Acredito que isso seja uma anti-pattern
 * Como estou usando o ViewModel, o recomendando pela google é que não
 * exista referência da view dentro desse objeto.
 * Logo, uma possível forma de fazer isso é a view ficar escutando os eventos emitidos pela
 * viewmodel
 *
 * https://medium.com/google-developers/viewmodels-and-livedata-patterns-antipatterns-21efaef74a54
 *
 * Estou tentando mininmizar o problema removendo a referência da activity no
 */
open abstract class MvpPresenter<V> : ViewModel(), LifecycleObserver {

    abstract val TAG : String

    protected var view: V? = null
        private set

    fun attachView(view: V) {
        this.view = view
    }

    fun detachView() {
        this.view = null
    }

    protected val isViewAttached: Boolean
        get() = view != null


    fun attachLifecycle(lifecycle: Lifecycle) {
        lifecycle.addObserver(this)
    }

    fun detachLifecycle(lifecycle: Lifecycle) {
        lifecycle.removeObserver(this)
    }

    fun onPresenterDestroy() {

    }
}