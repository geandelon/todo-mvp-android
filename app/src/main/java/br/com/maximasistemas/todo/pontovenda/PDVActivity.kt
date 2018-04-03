package br.com.maximasistemas.todo.pontovenda

import br.com.maximasistemas.todo.base.MvpActivityLista

class PDVActivity : MvpActivityLista<PDVView, PDVPresenter>() {

    override fun getClassePresenter(): Class<PDVPresenter> {
        return PDVPresenter::class.java
    }

}