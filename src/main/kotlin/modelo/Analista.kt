package modelo

class Analista(
    nome:String,
    cpf:String,
    salario:Double,
    val senha:Int=0
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
),Autenticavel{
    //comando override permite editar um metodo qu veio da classe mae
    override fun bonificacao(): Double {
        //comando super faz a chamada da funcao na classe pai, conceito de heranca
        return salario * 0.1
    }
    override fun autentica(senha: Int): Boolean = this.senha == senha


}