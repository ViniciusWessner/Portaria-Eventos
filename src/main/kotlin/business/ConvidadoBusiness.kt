package business

import ProjetoPortaria.entity.Convidado

open class ConvidadoBusiness {

    //pega os tipos de convite validos
    fun tiposValidos(tipo: String):Boolean {
        return (tipo == "comum" || tipo == "premium" || tipo == "luxo")
    }

    fun maiorDeIdade(idade: Int) = idade >= 18

    //valida o tipo do convite
    fun convidadoValido(convidado: Convidado): Boolean {
        return when (convidado.tipo) {
            "comum" -> {
                convidado.codigo.startsWith("xt")
            }
            "premium", "luxo" -> {
                convidado.codigo.startsWith("xl")
            }
            else -> {
                return false
            }
        }


    }

}

