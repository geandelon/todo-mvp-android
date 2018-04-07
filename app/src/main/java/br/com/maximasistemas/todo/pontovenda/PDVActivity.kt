package br.com.maximasistemas.todo.pontovenda

import android.os.Bundle
import br.com.maximasistemas.arch.mvp.MvpActivity
import br.com.maximasistemas.todo.R

class PDVActivity : MvpActivity<PDVView, PDVPresenter>() {

    override fun getClassePresenter(): Class<PDVPresenter> {
        return PDVPresenter::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}