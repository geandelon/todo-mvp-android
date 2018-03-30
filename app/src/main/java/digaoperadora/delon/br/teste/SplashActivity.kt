package digaoperadora.delon.br.teste

import android.os.Bundle
import digaoperadora.delon.br.teste.base.BaseMvpActivity

class SplashActivity : BaseMvpActivity<SplashPresenter, SplashViewModel>() {

    override fun getClasseViewModel(): Class<SplashViewModel> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getClassePresenter(): Class<SplashPresenter> {
        return SplashPresenter::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
