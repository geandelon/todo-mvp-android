package br.com.maximasistemas.arch.mvp

import android.os.Bundle

abstract class MvpActivityLista<V, P : MvpPresenter<V>> : MvpActivity<V, P>(), MvpActivityListaView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var listateste = ArrayList<Any>()

        val listaabc = ArrayList<Any>()

        val listade: List<String> = ArrayList()

        val listafg: MutableCollection<String> = ArrayList()


    }

    override fun exibirLista(lista: MutableCollection<Any>) {

    }

    override fun exibirVazio() {

    }

    override fun mostrarCarregando() {

    }
}