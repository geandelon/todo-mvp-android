package br.com.maximasistemas.arch.mvp

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class MvpActivity<V, P : MvpPresenter<V>> : AppCompatActivity(), LifecycleOwner {

    lateinit var viewModel: MvpPresenter<V>

    abstract fun getPresenterClass(): Class<P>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(getPresenterClass())
        viewModel.attachLifecycle(lifecycle)
        viewModel.attachView(this as V)
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.detachLifecycle(lifecycle)
        viewModel.detachView()
    }

}