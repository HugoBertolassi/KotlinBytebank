package modelo

import modelo.Autenticavel
import modelo.FuncionarioAdmin

class Gerente(
    nome:String,
    cpf:String,
    salario:Double,
    senha:Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha=senha
), Autenticavel {
    //comando override permite editar um metodo qu veio da classe mae
    override fun bonificacao(): Double {
        //comando super faz a chamada da funcao na classe pai, conceito de heranca
        return  salario * 1.1
    }

    //roda a autenticavel da funcionario Admin
    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }


//    fun autentica(senha:Int): Boolean {
//        if(this.senha==senha){
//            return true
//        }
//        return false
//        if(tipo ==1){
//            //pode autenticar
//        }
//    }
}