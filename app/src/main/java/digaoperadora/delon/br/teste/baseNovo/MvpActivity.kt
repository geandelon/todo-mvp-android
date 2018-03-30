package digaoperadora.delon.br.teste.baseNovo

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

open abstract class MvpActivity<P : MvpPresenter<V>, V> : AppCompatActivity(), LifecycleOwner {

    //inline fun <reified P : Any> classOfPresenter(p: MvpPresenter<V>) = P::class.java

    var viewModel: MvpViewModel? = null

    abstract fun getClassePresenter(): Class<P>

    fun presenter(): P {
        return viewModel?.presenter as P
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Não estou conseguindo recuperar a instância do viewmodel
        viewModel = ViewModelProvider.AndroidViewModelFactory(application).create(MvpViewModel::class.java)
        viewModel?.presenter = viewModel?.presenter ?: getClassePresenter().newInstance()

        presenter().attachLifecycle(lifecycle)
        presenter().attachView(this as V)

    }

    override fun onDestroy() {
        super.onDestroy()
        presenter().detachLifecycle(lifecycle)
        presenter().detachView()
    }

}