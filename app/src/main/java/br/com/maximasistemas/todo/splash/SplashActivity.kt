package br.com.maximasistemas.todo.splash

import br.com.maximasistemas.todo.base.MvpActivity

class SplashActivity : MvpActivity<SplashPresenter, SplashView>(), SplashView {

    override fun getClassePresenter(): Class<SplashPresenter> {
        return SplashPresenter::class.java
    }

    override fun iniciarTela() {
    }

}