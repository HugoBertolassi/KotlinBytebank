package modelo

import modelo.Autenticavel
import modelo.FuncionarioAdmin

class Diretor(
    nome:String,
    cpf:String,
    salario:Double,
    senha:Int,
    val plr:Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha=senha
), Autenticavel//interfaces
{
    override fun bonificacao(): Double {
        return  salario *1.1 + plr
    }
    //essa marcacao do Super fala que vamos consumir a funcao autententicavel da Interface
    override fun autentica(senha: Int): Boolean {
        return super<Autenticavel>.autentica(senha)
    }
    //fun habilitada quando criou a classe modelo.FuncionarioAdmin
//    fun autentica(senha:Int): Boolean {
//        if(this.senha==senha){
//            return true
//        }
//        return false
//    }
}