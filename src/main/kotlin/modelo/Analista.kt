package modelo

class Analista(
    nome:String,
    cpf:String,
    salario:Double,
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    //comando override permite editar um metodo qu veio da classe mae
    override fun bonificacao(): Double {
        //comando super faz a chamada da funcao na classe pai, conceito de heranca
        return salario * 0.1
    }

}