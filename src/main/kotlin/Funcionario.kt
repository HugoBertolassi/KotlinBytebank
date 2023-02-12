//open lbera fazer heranca da classe
open class Funcionario(
    val nome:String,
    val cpf:String,
    val salario:Double
    //val tipo:Int //0funcionario comum, 1 gerente, 2 diretor
) {

    open fun bonificacao(): Double {
        return salario*0.1
    }
    //        when(tipo){
//            0->{return salario*0.1}
//            1->{return salario*0.2}
//            else->{return salario*0.3}
//        }



}