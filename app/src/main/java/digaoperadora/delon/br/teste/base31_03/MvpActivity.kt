package maximasistemas.com.br.todomxsmvp.ui.base31_03

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity

open abstract class MvpActivity<P : MvpPresenter> : AppCompatActivity(), LifecycleOwner {

    @LayoutRes abstract fun getLayoutID() :  Int

    lateinit var viewModel: MvpPresenter

    fun getPresenter() = ( this.viewModel ?: ViewModelProviders.of(this).get(getClassePresenter()) ) as P

    abstract fun getClassePresenter(): Class<P>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutID())

        viewModel = ViewModelProviders.of(this).get(getClassePresenter()) as P
        viewModel.attachLifecycle(lifecycle)

    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.detachLifecycle(lifecycle)

    }

}