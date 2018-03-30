package digaoperadora.delon.br.teste.splashNovo

import android.os.Bundle
import android.widget.Toast
import digaoperadora.delon.br.teste.baseNovo.MvpActivity
import maximasistemas.com.br.todomxsmvp.ui.splashNovo.SplashView

class SplashActivity : MvpActivity<SplashPresenter, SplashView>(), SplashView {

    override fun onTeste() {
    }

    override fun getClassePresenter(): Class<SplashPresenter> {
        return SplashPresenter::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var presenter = viewModel?.presenter
        Toast.makeText(this, "Deu certo", Toast.LENGTH_LONG).show()

        var presenter2 = presenter()
    }

}