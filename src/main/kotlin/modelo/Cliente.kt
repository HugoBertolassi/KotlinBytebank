package modelo

class Cliente(
    val nome:String,
    var endereco:Endereco=Endereco(),
    val cpf:String,
    val senha:Int
): Autenticavel

    //Pelo metodo estar implementado na interface, nao tem necessidade de ffaze-lo aqui
{
    override fun autentica(senha:Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}