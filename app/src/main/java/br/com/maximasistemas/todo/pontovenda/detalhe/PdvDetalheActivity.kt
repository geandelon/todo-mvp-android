package br.com.maximasistemas.todo.pontovenda.detalhe

import android.os.Bundle
import br.com.maximasistemas.arch.mvp.MvpActivity
import br.com.maximasistemas.todo.R

class PdvDetalheActivity : MvpActivity<PdvDetalheView, PdvDetalhePresenter>() {

    override fun obterClassePresenter(): Class<PdvDetalhePresenter> {
        return PdvDetalhePresenter::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdv_detalhe)
    }

}