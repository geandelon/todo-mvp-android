package digaoperadora.delon.br.teste.mvvm

import android.os.Bundle
import android.view.View
import digaoperadora.delon.br.teste.R
import kotlinx.android.synthetic.main.activity_contador.*

class ActivityContador : MvvmActivity<VmContador>() {

    override fun getLayoutID(): Int {
        return R.layout.activity_contador
    }

    override fun getClassePresenter(): Class<VmContador> {
        return VmContador::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getPresenter().CallBack(evento = { valor -> tvContador.text = "${valor}" })
        btnMais.setOnClickListener( View.OnClickListener { getPresenter().eventoIncrementaEmUm() })
        btnMenos.setOnClickListener { View.OnClickListener { getPresenter().eventoDecrementaEmUm() }}

    }


}
