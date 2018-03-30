package digaoperadora.delon.br.teste.base

/**
 * Created by geandelon on 27/03/2018.
 */
abstract class BaseMvpPresenter< V : IMvpView >  : IMvpPresenter<V> {

    abstract var mModelo : IMvpModel

    abstract var mRepositoryLocal : IMvpRepository<IMvpModel>

    abstract var mRepositoryRemoto : IMvpRepository<IMvpModel>


}
