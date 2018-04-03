package br.com.maximasistemas.todo.base

import android.os.Bundle

abstract class MvpActivityLista<M : Collection<M>, V, P : MvpPresenter<V>> : MvpActivity<V, P>(), MvpActivityListaView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun exibirVazio() {

    }

    override fun mostrarCarregando() {

    }
}