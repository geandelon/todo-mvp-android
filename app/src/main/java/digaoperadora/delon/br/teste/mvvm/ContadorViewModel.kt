package digaoperadora.delon.br.teste.mvvm

import android.util.Log
import digaoperadora.delon.br.teste.mvvm.BaseViewModel.Modelo.Valor

class ContadorViewModel : BaseViewModel() {

    override fun InicializarValores() {
        onResume = { observerCallBack(contador)
            Log.v(TAG, "Atualizado valor(${contador}) do contador no OnResume ")
        }
    }

    override var modelo : Modelo<*> = Modelo.Valor(0)

    fun eventoIncrementaEmUm(){
        this.contador++
    }
    fun eventoDecrementaEmUm(){
        this.contador--
    }
    fun CallBack(evento : (valor : Int)->Unit ) {
        observerCallBack = evento ?: observerCallBack
    }


    private var observerCallBack : (valor : Int)->Unit ={ Log.d(TAG, "Evento do Presenter sem implementação na visão, recebeu um valor:  ${it}, como parametro") }


    //thimodelo =  Modelo.Valor<Int>.value(0)


    var contador : Int = 0
    set(value) {
        field = value
        observerCallBack(value)

    }

    override val TAG: String
        get() = ContadorViewModel::class.java.simpleName






}