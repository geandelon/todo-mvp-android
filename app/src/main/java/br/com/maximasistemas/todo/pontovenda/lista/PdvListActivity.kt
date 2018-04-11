package br.com.maximasistemas.todo.pontovenda.lista

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.animation.OvershootInterpolator
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.Toast
import br.com.maximasistemas.arch.mvp.MvpActivity
import br.com.maximasistemas.todo.R
import br.com.maximasistemas.todo.pontovenda.detalhe.PdvDetailActivity
import br.com.maximasistemas.todo.pontovenda.modelo.Pdv
import br.com.maximasistemas.todo.util.Constantes
import br.com.maximasistemas.todo.util.empty
import fr.castorflex.android.circularprogressbar.CircularProgressBar
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator
import kotlinx.android.synthetic.main.activity_pdv.*
import kotlinx.android.synthetic.main.include_lista.*
import org.jetbrains.anko.startActivity

class PdvListActivity : MvpActivity<PdvListView, PdvListPresenter>() {

    lateinit var rcvDados: RecyclerView
    lateinit var pgbProcessando: ProgressBar
    lateinit var llyTexto: LinearLayout

    override fun getPresenterClass(): Class<PdvListPresenter> {
        return PdvListPresenter::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdv)

        setSupportActionBar(activity_pdv_icl_toolbar as Toolbar?)
        supportActionBar?.setTitle("Clientes")

        rcvDados = include_lista_ryv_dados
        pgbProcessando = include_lista_pgb_processando
        llyTexto = include_lista_lly_texto

        val llm = LinearLayoutManager(this)

        with(rcvDados) {
            setLayoutManager(llm)
            setHasFixedSize(true)
            setItemAnimator(SlideInUpAnimator(OvershootInterpolator(1f)))
            adapter = PdvListAdapter({ pdv: Pdv -> onClickPDV(pdv) })
        }

        exibirLista(obterListaPdv())
    }

    fun onClickPDV(pdv: Pdv) {
        Toast.makeText(this, pdv.razaoSocial, Toast.LENGTH_LONG).show()
        startActivity<PdvDetailActivity>(Constantes.EXTRA_PDV to pdv)
    }

    fun exibirLista(lista: MutableList<Pdv>) {
        rcvDados.setVisibility(RecyclerView.VISIBLE)
        pgbProcessando.setVisibility(CircularProgressBar.GONE)
        llyTexto.setVisibility(LinearLayout.GONE)

        var adapter = (rcvDados.adapter as PdvListAdapter)
        adapter.lista = lista
        adapter.notifyDataSetChanged()
    }

    private fun obterListaPdv(): MutableList<Pdv> {
        return listOf(
                Pdv("402029", "14.886.240/0001-20", "A B DOS SANTOS COMERCIO DE SEMENTES ME", "CASA DA SEMENTE"),
                Pdv("2202", "26.664.789/0001-79", "CASA DA SEMENTE", String.empty()),
                Pdv("655211", "19.310.40/0001-67", "A M GODOI JUNIOR - TERRA DE PEDROS ME", "A M GODOI JUNIOR - TERRA DE PE"),
                Pdv("655634", "20.664.198/0001-15", "AGROFITO INSUMOS AGRICOLAS LTDA", "AGROFITO"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("3054", "08.741.580/0001-80", "AGROPAULOS PRODUTOS AGROPECUARIOS LTDA ME", "AGROPAULOS"),
                Pdv("655114", "57.320.558/0001-71", "AGROVETERINARIA RAIZES", "AGROVETERINARIA")
        ).toMutableList()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}