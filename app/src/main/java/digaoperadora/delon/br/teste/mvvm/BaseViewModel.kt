package digaoperadora.delon.br.teste.mvvm

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.arch.lifecycle.ViewModel
import android.util.Log
import java.lang.reflect.Type
import kotlin.properties.Delegates


abstract class BaseViewModel : ViewModel(), LifecycleObserver {




    abstract var modelo : Modelo<*>

    abstract fun InicializarValores()

    init {

        InicializarValores()

    }


    sealed class Modelo<T>(open var value: T?) {
        object Vazio : Modelo<Nothing>(null)
        data class Valor<T>(override var value: T?) : Modelo<T>(null)
    }



    private val TAG_EVENTO_ON_CREATE  = "Evento Padrao: ON_CREATE"
    private val TAG_EVENTO_ON_START   = "Evento Padrao: ON_START"
    private val TAG_EVENTO_ON_RESUME  = "Evento Padrao: ON_RESUME"
    private val TAG_EVENTO_ON_PAUSE   = "Evento Padrao: ON_PAUSE"
    private val TAG_EVENTO_ON_STOP    = "Evento Padrao: ON_STOP"
    private val TAG_EVENTO_ON_DESTROY = "Evento Padrao: ON_DESTROY"


    protected var onCreate: () -> Unit = { Log.d(TAG, TAG_EVENTO_ON_CREATE) }
        set(value) {
            if (value != null) field = value
        }
    protected var onStart: () -> Unit = { Log.d(TAG, TAG_EVENTO_ON_START) }
        set(value) {
            if (value != null) field = value
        }
    protected var onResume: () -> Unit = { Log.d(TAG, TAG_EVENTO_ON_RESUME) }
        set(value) {
            if (value != null) field = value
        }
    protected var onPause: () -> Unit = { Log.d(TAG, TAG_EVENTO_ON_PAUSE) }
        set(value) {
            if (value != null) field = value
        }
    protected var onStop: () -> Unit = { Log.d(TAG, TAG_EVENTO_ON_STOP) }
        set(value) {
            if (value != null) field = value
        }
    protected var onDestroy: () -> Unit = { Log.d(TAG, TAG_EVENTO_ON_DESTROY) }
        set(value) {
            if (value != null) field = value
        }


    abstract val TAG: String

    fun attachLifecycle(lifecycle: Lifecycle) {
        lifecycle.addObserver(this)
    }

    fun detachLifecycle(lifecycle: Lifecycle) {
        lifecycle.removeObserver(this)
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun OnLifecycleEventCreate() {
        this.onCreate.invoke()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun OnLifecycleEventStart() {
        this.onStart.invoke()
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun OnLifecycleEventResume() {
        this.onResume.invoke()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun OnLifecycleEventPause() {
        this.onPause.invoke()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun OnLifecycleEventStop() {
        this.onStop.invoke()
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun OnLifecycleEventDestroy() {
        this.onDestroy.invoke()
    }
}