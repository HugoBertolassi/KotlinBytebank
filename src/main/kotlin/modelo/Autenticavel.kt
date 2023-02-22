package modelo

interface Autenticavel {

    fun autentica(senha:Int):Boolean
//remocao da validacao de senha dentro da inteface
//val senha: Int
//    open fun autentica(senha: Int): Boolean {
//        if (this.senha == senha) {
//            return true
//        }
//        return false
//
//    }
}