package digaoperadora.delon.br.teste.base

/**
 * Created by geandelon on 27/03/2018.
 */
abstract class BaseMvpViewModel  : IMvpView {
    abstract var presenter: BaseMvpPresenter<IMvpView>?


}