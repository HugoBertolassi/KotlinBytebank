package teste

import modelo.Autenticavel
import modelo.SistemaInterno

public fun testaObjetos() {
    //criacao de object expression, objeto anonimo https://kotlinlang.org/docs/object-declarations.html
    val fran = object : Autenticavel {
        val nome: String = "fran"
        val cpf: String = "123"
        override val senha: Int = 12

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 12)
    println("Cliente ${fran.nome}")
}

