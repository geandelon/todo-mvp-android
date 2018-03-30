package digaoperadora.delon.br.teste.base

interface IMvpView {
    fun attach():Unit
    fun detach():Unit

}
interface IMvpPresenter<V : IMvpView>

interface IMvpModel

interface IMvpRepository<M : IMvpModel>
