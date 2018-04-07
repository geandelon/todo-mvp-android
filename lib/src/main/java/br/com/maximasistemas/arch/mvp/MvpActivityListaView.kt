package br.com.maximasistemas.arch.mvp

interface MvpActivityListaView {

    fun exibirLista()

    fun exibirVazio()

    fun mostrarCarregando()

    fun exibirLista(lista: MutableCollection<Any>)
}