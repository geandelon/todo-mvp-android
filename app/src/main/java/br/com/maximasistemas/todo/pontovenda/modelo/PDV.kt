package br.com.maximasistemas.todo.pontovenda.modelo

data class PDV(var codigo: String, var cpfCnpj: String, var razaoSocial: String, var nomeFantasia: String) {

    constructor() : this(
            "",
            "",
            "",
            ""
    )

    constructor(codigo: String) : this(
            codigo,
            "",
            "",
            ""
    )

}