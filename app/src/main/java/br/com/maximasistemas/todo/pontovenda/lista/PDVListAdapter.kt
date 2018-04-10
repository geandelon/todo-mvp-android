package br.com.maximasistemas.todo.pontovenda.lista

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.maximasistemas.todo.R
import br.com.maximasistemas.todo.pontovenda.modelo.PDV
import kotlinx.android.synthetic.main.adapter_pdv.view.*

class PDVListAdapter(val onClick: (PDV) -> Unit) : RecyclerView.Adapter<PDVListAdapter.ViewHolder>() {

    lateinit var lista: MutableList<PDV>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_pdv, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pdv = lista[position]
        holder.bindView(pdv, onClick)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(pdv: PDV, onClick: (PDV) -> Unit) {
            with(itemView) {
                val razaoSocialFormatada = "${pdv.codigo} - ${pdv.razaoSocial}"
                adapter_pdv_txv_razao_social.text = razaoSocialFormatada
                adapter_pdv_txv_nome_fantasia.text = pdv.nomeFantasia
                adapter_pdv_txv_cpf_cnpj.text = pdv.cpfCnpj
                setOnClickListener { onClick(pdv) }
            }
        }

    }
}

