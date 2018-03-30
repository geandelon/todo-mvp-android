package digaoperadora.delon.br.teste.base

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import kotlin.jvm.javaClass
import android.support.v7.app.AppCompatActivity
import kotlin.reflect.KClass

/**
 * Created by geandelon on 27/03/2018.
 */
open class BaseMvpActivity<P : BaseMvpPresenter<VM>, VM :BaseMvpViewModel>: AppCompatActivity()  {

    var presenter: P? = null
    var viewModel: VM? = null

    inline fun <reified P>  newInstanciaPresenter() =  P::class.java.newInstance()
    inline fun <reified VM> newInstanciaView()      = VM::class.java.newInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //viewModel = BaseMvpViewModel()

        //var vm = ViewModelProvider.AndroidViewModelFactory(application).create(getClasseViewModel().newInstance())


        viewModel?.let {
           return newInstanciaView()
        }

        viewModel?.presenter?.let {
            return this.newInstanciaPresenter()
        }



    }

}