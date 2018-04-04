package maximasistemas.com.br.todomxsmvp.ui.base31_03

import android.os.Bundle
import digaoperadora.delon.br.teste.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class SplashActivity : MvpActivity<SplashPresenter>(), SplashView {
    override fun getLayoutID(): Int {
        return R.layout.activity_main
    }

    override fun getClassePresenter(): Class<SplashPresenter> {
        return SplashPresenter::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        iniciarTela()
    }

    override fun iniciarTela() {
     // getPresenter().setOnContadorChange(::atualizaContador)
    }

    fun atualizaContador(contador : Int){
        tvContador.text = "${contador}"
    }

}