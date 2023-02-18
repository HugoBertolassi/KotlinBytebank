package modelo
//open lbera fazer heranca da classe

//abstract tem open por padrao, serve para informar quea classe n'ao pode receber nada mas [e base para outras classes
abstract open class Funcionario(
    val nome:String,
    val cpf:String,
    val salario:Double
    //val tipo:Int //0funcionario comum, 1 gerente, 2 diretor
) {

    //abstrair uma funcao obriga que ela seja implementada em seus filhos, e evitando que tenha um padrao que possa ser chamado erroneamente

    abstract fun bonificacao(): Double

//funcao antiga
//    open fun bonificacao(): Double {
//        return salario*0.1
//    }
    //        when(tipo){
//            0->{return salario*0.1}
//            1->{return salario*0.2}
//            else->{return salario*0.3}
//        }



}