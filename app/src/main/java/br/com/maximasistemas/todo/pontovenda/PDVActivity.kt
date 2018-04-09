package br.com.maximasistemas.todo.pontovenda

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.animation.OvershootInterpolator
import android.widget.LinearLayout
import android.widget.ProgressBar
import br.com.maximasistemas.arch.mvp.MvpActivity
import br.com.maximasistemas.todo.R
import br.com.maximasistemas.todo.pontovenda.modelo.PDV
import br.com.maximasistemas.todo.util.empty
import fr.castorflex.android.circularprogressbar.CircularProgressBar
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator
import kotlinx.android.synthetic.main.activity_pdv.*
import kotlinx.android.synthetic.main.include_lista.*

class PDVActivity : MvpActivity<PDVView, PDVPresenter>() {

    lateinit var rcvDados: RecyclerView
    lateinit var pgbProcessando: ProgressBar
    lateinit var llyTexto: LinearLayout
    val pdvAdapter = PDVAdapter(this)

    override fun getClassePresenter(): Class<PDVPresenter> {
        return PDVPresenter::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdv)

        rcvDados = include_lista_ryv_dados
        pgbProcessando = include_lista_pgb_processando
        llyTexto = include_lista_lly_texto

        setSupportActionBar(activity_pdv_icl_toolbar as Toolbar?)
        supportActionBar?.setTitle("Clientes")

        val llm = LinearLayoutManager(this)
        rcvDados.setLayoutManager(llm)
        rcvDados.setHasFixedSize(true)
        rcvDados.setItemAnimator(SlideInUpAnimator(OvershootInterpolator(1f)))
        rcvDados.adapter = pdvAdapter

        exibirLista(carregarPDVs())
        pdvAdapter.notifyDataSetChanged()
    }

    fun exibirLista(lista: MutableList<PDV>) {
        pdvAdapter.lista = lista
        rcvDados.setVisibility(RecyclerView.VISIBLE)
        pgbProcessando.setVisibility(CircularProgressBar.GONE)
        llyTexto.setVisibility(LinearLayout.GONE)
    }

    private fun carregarPDVs(): MutableList<PDV> {
        return listOf(
                PDV("402029", "14.886.240/0001-20", "A B DOS SANTOS COMERCIO DE SEMENTES ME", "CASA DA SEMENTE"),
                PDV("2202", "26.664.789/0001-79", "CASA DA SEMENTE", String.empty()),
                PDV("655211", "19.310.40/0001-67", "A M GODOI JUNIOR - TERRA DE PEDROS ME", "A M GODOI JUNIOR - TERRA DE PE"),
                PDV("655634", "20.664.198/0001-15", "AGROFITO INSUMOS AGRICOLAS LTDA", "AGROFITO"),
                PDV("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                PDV("655114", "57.320.558/0001-71", "AGROVETERINARIA RAIZES", "AGROVETERINARIA")
        ).toMutableList()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}