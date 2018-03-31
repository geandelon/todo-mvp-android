package maximasistemas.com.br.todomxsmvp.ui.base31_03

class SplashActivity : MvpActivity<SplashPresenter, SplashView>(), SplashView {

    override fun getClassePresenter(): Class<SplashPresenter> {
        return SplashPresenter::class.java
    }

    override fun iniciarTela() {
    }

}