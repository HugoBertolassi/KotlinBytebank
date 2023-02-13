class SistemaInterno {
   // fun entra(admin: FuncionarioAdmin, senha:Int){//Fazia a validacao por classe
    fun entra(admin: Autenticavel, senha:Int){//admin valida pela interface
       if( admin.autentica(senha)){
           println("Bem vindo ao bytebank")
       }
        else{
            println("Falha na autenticacao")
       }
    }

}