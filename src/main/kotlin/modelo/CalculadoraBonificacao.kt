package modelo

class CalculadoraBonificacao {
    var total:Double = 0.0
        private set
//CAsting com o tipo any, o correto eh colocar funcionario na funcao
    fun registra(funcionario: Any){
        //funcionario as Funcionario //casting padrao
        //se for tipo any nao funciona os metodos do funcnionario
        // a funcao aceita qualquer tipo entao [e necessario blindar com um if
        if(funcionario is Funcionario) {//is faz uma validacao e casting, chamado de smart casting
            this.total += funcionario.bonificacao()
        }
    }

//    fun registra(funcionario: Funcionario){
//        this.total += funcionario.bonificacao()
//    }



//    fun registra(gerente: modelo.Gerente){
//        this.total += gerente.bonificacao()
//    }
//    fun registra(diretor: modelo.Diretor){
//        this.total += diretor.bonificacao()
//    }

}