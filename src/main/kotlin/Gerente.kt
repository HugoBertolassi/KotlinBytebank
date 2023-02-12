class Gerente(
    nome:String,
    cpf:String,
    salario:Double,
    val senha:Int
) :Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    //comando override permite editar um metodo qu veio da classe mae
    override fun bonificacao(): Double {
        //comando super faz a chamada da funcao na classe pai, conceito de heranca
        return  salario * 1.1
    }
    fun autentica(senha:Int): Boolean {
        if(this.senha==senha){
            return true
        }
        return false
//        if(tipo ==1){
//            //pode autenticar
//        }
    }
}