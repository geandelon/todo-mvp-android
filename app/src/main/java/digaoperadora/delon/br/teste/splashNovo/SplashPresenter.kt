package digaoperadora.delon.br.teste.splashNovo

import digaoperadora.delon.br.teste.baseNovo.MvpPresenter
import maximasistemas.com.br.todomxsmvp.ui.splashNovo.SplashView


class SplashPresenter : MvpPresenter<SplashView>() {

    fun onTeste() {
        view?.onTeste()
    }

}