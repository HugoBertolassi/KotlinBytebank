package modelo

import modelo.Autenticavel

class Cliente(
    val nome:String,
    val cpf:String,
    override val senha:Int
): Autenticavel

    //Pelo metodo estar implementado na interface, nao tem necessidade de ffaze-lo aqui
//{
//    override fun autentica(senha:Int): Boolean {
//        if (this.senha == senha) {
//            return true
//        }
//        return false
//    }
//}