package digaoperadora.delon.br.teste.mvvm

import android.util.Log

class VmContador : BaseViewModel() {


    var eventoIncrementaEmX   : (x : Int)->Unit = {x: Int -> contador + x }
        set(value) {
            value?.let {
                 field = it
            }
        }
    var eventoIncrementaEmUm  : ()->Unit = { contador.inc() }
        set(value) {
            value?.let {
                field = it
            }
        }
    var eventoDecromentaEmX   : (x : Int)->Unit = {x: Int -> contador - x }
        set(value) {
            value?.let {
                field = it
            }
        }
    var eventoDecromentaEmUm  : ()->Unit = { contador.dec() }
        set(value) {
            value?.let {
                field = it
            }
        }

    var observerCallBack : (contador: Int)->Unit ={ Log.d(TAG, "Evento do Presenter sem implementação na visão, recebeu um valor:  ${it}, como parametro") }
    set(value) {
        value?.let {
            field = it
        }
    }


    var AnyToModelo : (Any)->Int = { any: Any -> any as Int}
    set(value) {
        if(value != null ) field = value
    }

    var contador : Int = 0
    set(value) {}

    override fun getModelo(): Any {
        return contador
    }


    override val TAG: String
        get() = VmContador::class.java.simpleName


}