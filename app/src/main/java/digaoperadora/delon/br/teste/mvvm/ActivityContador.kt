package digaoperadora.delon.br.teste.mvvm

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import digaoperadora.delon.br.teste.R
import kotlinx.android.synthetic.main.activity_contador.*
import org.jetbrains.anko.*

class ActivityContador : MvvmActivity<ContadorViewModel>() {

    val  TAG = ActivityContador::class.java.simpleName

    override fun getLayoutID(): Int {
        return R.layout.activity_contador
    }

    override fun getClassePresenter(): Class<ContadorViewModel> {
        return ContadorViewModel::class.java
    }

    private val onClickListenerBtnAddX = View.OnClickListener {
        var valorSelecionado: Int = 0
        var valorEditText: EditText? = null

        alert {
            title = "Digite um valor"
            customView {

                valorEditText = editText()

            }
            yesButton {
                try {

                    valorSelecionado = if (valorEditText?.text.toString().isEmpty()) 0 else valorEditText?.text.toString().toInt()
                    getPresenter().eventoIncrementaEmX(valorSelecionado)

                } catch (ex: NumberFormatException) {

                    Log.v(ActivityContador@ TAG, "\n ERRO DE FORMATO \n", ex)
                    getPresenter().eventoIncrementaEmX(0)

                }
            }
            noButton { }
        }.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        getPresenter().CallBack(
                evento = { valor -> tvContador.text = "${valor}" }
        )

        btnMenos.setOnClickListener(
                View.OnClickListener { getPresenter().eventoDecrementaEmUm() }
        )

        btnMais.setOnClickListener(
                View.OnClickListener { getPresenter().eventoIncrementaEmUm() }
        )
        btnAddX.setOnClickListener(onClickListenerBtnAddX)

    }

}

