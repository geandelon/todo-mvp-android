package digaoperadora.delon.br.teste

import android.os.Bundle
import digaoperadora.delon.br.teste.base.BaseMvpActivity

class SplashActivity : BaseMvpActivity<SplashPresenter, SplashViewModel>() {

    override fun getClassePresenter(): Class<SplashPresenter> {
        return SplashPresenter::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
