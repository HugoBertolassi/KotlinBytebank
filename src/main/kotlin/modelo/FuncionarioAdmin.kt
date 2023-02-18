package modelo

import modelo.Funcionario

//open lbera fazer heranca da classe

//abstract tem open por padrao, serve para informar quea classe n'ao pode receber nada mas [e base para outras classes
abstract open class FuncionarioAdmin(
     nome:String,
     cpf:String,
     salario:Double,
    val senha:Int
    //val tipo:Int //0funcionario comum, 1 gerente, 2 diretor
): Funcionario(
    nome=nome,
    cpf=cpf,
    salario=salario
) {

    //abstrair uma funcao obriga que ela seja implementada em seus filhos, e evitando que tenha um padrao que possa ser chamado erroneamente



    open fun autentica(senha:Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}