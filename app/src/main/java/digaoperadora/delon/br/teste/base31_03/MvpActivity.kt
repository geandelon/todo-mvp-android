package maximasistemas.com.br.todomxsmvp.ui.base31_03

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

open abstract class MvpActivity<P : MvpPresenter<V>, V> : AppCompatActivity(), LifecycleOwner {

    lateinit var viewModel: MvpPresenter<V>

    abstract fun getClassePresenter(): Class<P>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(getClassePresenter())
        viewModel.attachLifecycle(lifecycle)
        viewModel.attachView(this as V)
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.detachLifecycle(lifecycle)
        viewModel.detachView()
    }

}