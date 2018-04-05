package digaoperadora.delon.br.teste.mvvm

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.arch.lifecycle.ViewModel
import android.util.Log


abstract class BaseViewModel : ViewModel(), LifecycleObserver {

    private val TAG_EVENTO_ON_CREATE  = "ON_CREATE"
    private val TAG_EVENTO_ON_START   = "ON_START"
    private val TAG_EVENTO_ON_RESUME  = "ON_RESUME"
    private val TAG_EVENTO_ON_PAUSE   = "ON_PAUSE"
    private val TAG_EVENTO_ON_STOP    = "ON_STOP"
    private val TAG_EVENTO_ON_DESTROY = "ON_DESTROY"

    protected fun setOnLifecycleEventCreate(evento: () -> Unit) {
        onCreate = {
            evento.invoke()
            Log.d(TAG, "Evento Customizado: ${TAG_EVENTO_ON_CREATE}")
        }
    }
    protected fun setOnLifecycleEventStart(evento: () -> Unit) {
        onStart = {
            evento.invoke()
            Log.d(TAG, "Evento Customizado: ${TAG_EVENTO_ON_START}")
        }
    }
    protected fun setOnLifecycleEventResume(evento: () -> Unit) {
        onResume = {
            evento.invoke()
            Log.d(TAG, "Evento Customizado: ${TAG_EVENTO_ON_RESUME}")
        }
    }
    protected fun setOnLifecycleEventPause(evento: () -> Unit) {
        onPause ={
            evento.invoke()
            Log.d(TAG, "Evento Customizado: ${TAG_EVENTO_ON_PAUSE}")
        }
    }
    protected fun setOnLifecycleEventStop(evento: () -> Unit) {
        onStop = {
            evento.invoke()
            Log.d(TAG, "Evento Customizado: ${TAG_EVENTO_ON_STOP}")
        }
    }
    protected fun setOnLifecycleEventDestroy(evento: () -> Unit) {
        onDestroy = {
            evento.invoke()
            Log.d(TAG, "Evento Customizado: ${TAG_EVENTO_ON_DESTROY}")
        }
    }


    private var onCreate: () -> Unit = { Log.d(TAG, "Evento Padrao: ${TAG_EVENTO_ON_CREATE}") }

    private var onStart: () -> Unit = { Log.d(TAG, "Evento Padrao: ${TAG_EVENTO_ON_START}") }

    private var onResume: () -> Unit = { Log.d(TAG, "Evento Padrao: ${TAG_EVENTO_ON_RESUME}") }

    private var onPause: () -> Unit = { Log.d(TAG, "Evento Padrao: ${TAG_EVENTO_ON_PAUSE}") }

    private var onStop: () -> Unit = { Log.d(TAG, "Evento Padrao: ${TAG_EVENTO_ON_STOP}") }

    private var onDestroy: () -> Unit = { Log.d(TAG, "Evento Padrao: ${TAG_EVENTO_ON_DESTROY}") }


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