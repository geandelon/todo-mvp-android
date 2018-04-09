package br.com.maximasistemas.todo.pontovenda

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.maximasistemas.todo.R
import br.com.maximasistemas.todo.pontovenda.modelo.PDV
import kotlinx.android.synthetic.main.adapter_pdv.view.*

class PDVAdapter(private val contexto: Context) : RecyclerView.Adapter<PDVAdapter.ViewHolder>() {

    lateinit var lista: MutableList<PDV>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(contexto).inflate(R.layout.adapter_pdv, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pdv = lista[position]
        holder.bindView(pdv)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(pdv: PDV) {
            val txvRazaoSocial = itemView.adapter_pdv_txv_razao_social
            val txvNomeFantasia = itemView.adapter_pdv_txv_nome_fantasia
            val txvCpfCnpj = itemView.adapter_pdv_txv_cpf_cnpj

            txvRazaoSocial.text = String.format("%s - %s", pdv.codigo, pdv.razaoSocial)
            txvNomeFantasia.text = pdv.nomeFantasia
            txvCpfCnpj.text = pdv.cpfCnpj

        }

    }
}

