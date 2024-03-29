package modelo

class SistemaInterno {
   // fun entra(admin: modelo.FuncionarioAdmin, senha:Int){//Fazia a validacao por classe
    fun entra(admin: Autenticavel, senha:Int){//admin valida pela interface
       if( admin.autentica(senha)){
           println("Bem vindo ao bytebank")

       }
        else{
            println("Falha na autenticacao")
       }

       when(admin){
           is FuncionarioAdmin->{
               println("Opcoes Admin")
           }
           is Funcionario->{
               println("Opcoes Comum")
           }
           else->{
               println("Opcoes reduzidas")
           }
       }
    }

    fun entraHighOrder(admin: Autenticavel,senha: Int,autenticado:()->Unit={}){ //uds expressao lambda que nao faz nada no retorno de autenticado
        if( admin.autentica(senha)){
            println("Bem vindo ao bytebank")
            autenticado()//essa linha garante o retorno e processamento do retorno
        }
        else{
            println("Falha na autenticacao")
        }
    }

}