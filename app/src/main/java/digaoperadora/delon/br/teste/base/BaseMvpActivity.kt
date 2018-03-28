package digaoperadora.delon.br.teste.base

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by geandelon on 27/03/2018.
 */
open abstract class BaseMvpActivity<P, VM>: AppCompatActivity() where P: BaseMvpPresenter , VM: BaseMvpViewModel {

    var presenter: P? = null

    abstract fun getClassePresenter(): Class<P>

    var viewModel: VM? = null

    abstract fun getClasseViewModel(): Class<VM>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //viewModel = BaseMvpViewModel()

        //var vm = ViewModelProvider.AndroidViewModelFactory(application).create(getClasseViewModel().newInstance())



        if (viewModel?.presenter == null) {

            viewModel?.presenter = getClassePresenter().newInstance()

        }

    }

}