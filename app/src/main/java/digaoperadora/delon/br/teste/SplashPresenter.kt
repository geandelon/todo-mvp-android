package digaoperadora.delon.br.teste

import digaoperadora.delon.br.teste.base.BaseMvpPresenter
import digaoperadora.delon.br.teste.base.IMvpModel
import digaoperadora.delon.br.teste.base.IMvpRepository

/**
 * Created by geandelon on 27/03/2018.
 */
class SplashPresenter() : BaseMvpPresenter<SplashViewModel>(){
    override lateinit var mModelo: IMvpModel
    override lateinit var mRepositoryLocal: IMvpRepository<IMvpModel>
    override lateinit var mRepositoryRemoto: IMvpRepository<IMvpModel>
}