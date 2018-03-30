package digaoperadora.delon.br.teste.baseNovo

import android.arch.lifecycle.Lifecycle

open abstract class MvpPresenter<V> {

    var view: V? = null
        private set

    fun attachView(view: V) {
        this.view = view
    }

    fun detachView() {
        this.view = null
    }

    val isViewAttached: Boolean
        get() = view != null


    var lifecycle: Lifecycle? = null

    fun attachLifecycle(lifecycle: Lifecycle) {
        this.lifecycle = lifecycle
    }

    fun detachLifecycle(lifecycle: Lifecycle) {
        this.lifecycle = null
    }
}