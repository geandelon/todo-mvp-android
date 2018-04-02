package maximasistemas.com.br.todomxsmvp.ui.base31_03

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.ViewModel
import android.support.annotation.LayoutRes
import android.util.Log

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
open abstract class MvpPresenter :   ViewModel(),  LifecycleObserver {

    abstract val TAG : String

    val TAG_EVENTO_PADRAO = "Evento Padrao:"

    fun attachLifecycle(lifecycle: Lifecycle) {
        lifecycle.addObserver(this)
    }

    fun detachLifecycle(lifecycle: Lifecycle) {
        lifecycle.removeObserver(this)
    }

    var exibirMensagem : (String) -> Unit = { Log.d(TAG, TAG_EVENTO_PADRAO + it) }
    set(value) {
        if(value != null ) field = value
    }

    var exibirAlerta : (titulo : String, mensagem : String )->Unit =  { titulo, mensagem ->   Log.d(TAG, TAG_EVENTO_PADRAO + "\n Mensagem com titulo: ${titulo} \n e texto: ${mensagem}" ) }
    set(value) {
        if(value != null ) field = value
    }

}
