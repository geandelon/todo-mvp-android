package br.com.maximasistemas.todo.teste

import br.com.maximasistemas.arch.mvp.MvpActivity

class TesteActivity : MvpActivity<TesteView, TestePresenter>(), TesteView {

    override fun obterClassePresenter(): Class<TestePresenter> {
        return TestePresenter::class.java
    }

    override fun iniciarTela() {
    }

}