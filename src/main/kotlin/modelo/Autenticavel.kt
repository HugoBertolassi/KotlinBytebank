package modelo

interface Autenticavel {
    val senha: Int

    open fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false

    }
}