package br.com.maximasistemas.todo.teste

import br.com.maximasistemas.todo.base.MvpActivity

class TesteActivity : MvpActivity<TestePresenter, TesteView>(), TesteView {

    override fun getClassePresenter(): Class<TestePresenter> {
        return TestePresenter::class.java
    }

    override fun iniciarTela() {
    }

}