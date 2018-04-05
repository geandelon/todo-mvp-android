package digaoperadora.delon.br.teste.mvvm

import android.util.Log

class ContadorViewModel : BaseViewModel() {

    init {
        setOnLifecycleEventResume({
            observerCallBack(this.contador)
            Log.v(TAG, "Atualizado valor(${this.contador}) do contador no OnResume ")
        })
    }

    fun eventoIncrementaEmX(valor: Int) {
        this.contador += valor
    }

    fun eventoIncrementaEmUm() {
        this.contador++
    }

    fun eventoDecrementaEmUm() {
        this.contador--
    }

    fun CallBack(evento: (valor: Int) -> Unit) {
        observerCallBack = {
            evento.invoke(it)
            Log.v(TAG, "Evento CallBack atualizando valor ${it}")
        }
    }

    private var observerCallBack: (valor: Int) -> Unit = { Log.d(TAG, "Evento do Presenter sem implementação na visão, recebeu um valor:  ${it}, como parametro") }

    var contador: Int = 0
        set(value) {
            field = value
            observerCallBack(value)

        }

    override val TAG: String
        get() = ContadorViewModel::class.java.simpleName


}