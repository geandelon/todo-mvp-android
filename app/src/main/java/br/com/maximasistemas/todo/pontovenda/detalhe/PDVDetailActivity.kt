package br.com.maximasistemas.todo.pontovenda.detalhe

import android.os.Bundle
import br.com.maximasistemas.arch.mvp.MvpActivity
import br.com.maximasistemas.todo.R

class PDVDetailActivity : MvpActivity<PDVDetailView, PDVDetailPresenter>() {

    override fun getPresenterClass(): Class<PDVDetailPresenter> {
        return PDVDetailPresenter::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdv_detail)
    }

}