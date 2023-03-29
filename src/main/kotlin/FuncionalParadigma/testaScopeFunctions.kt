package FuncionalParadigma

import modelo.Autenticavel
import modelo.Endereco
import modelo.SistemaInterno


fun testaScopeFunctions() {
    //High orders function
    //let vem de padrao do generics
//    Endereco().let{
//        it
//    }
//    "".let{//tipo string
//        it
//    }
//    "".let(::testeRecebeString)
//    1.let{//tipo inteiro
//        it
//    }

    //testes de high function

    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
    val enderecoEmMaiusculo = "${endereco.logradouro},${endereco.numero}".uppercase()
    println(enderecoEmMaiusculo)

    ///usando let, nao precisa criar outras variaveis ou concacatenar  lets
    val enderecoEmMaiusculo2 = Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco ->
            "${endereco.logradouro},${endereco.numero}".uppercase()
        }
    println(enderecoEmMaiusculo2)
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco ->
            "${endereco.logradouro},${endereco.numero}".uppercase()
            //}.let{enderecoEmMaiusculo->
            //    println(enderecoEmMaiusculo)
        }.let(::println)//essa reimpressao [eo pra vizualizar que podemos chamar outra fucao que tem retorno

    Endereco(logradouro = "rua vergueiross", numero = 3185)
        .run {//o apply o valor do this fica implicito, por iss nao é obrigado colocar no atributo, o retorno é o proprio objeto por isso nao fica em maisuculo na impressao
            "Apply: ${logradouro},${this.numero}".uppercase()
            //}.let{enderecoEmMaiusculo->
            //    println(enderecoEmMaiusculo)
        }.let(::println)//essa reimpressao [eo pra vizualizar que podemos chamar outra fucao que tem retorno

    //exemplo de lista e filtarando
    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter { end -> end.complemento?.isNotEmpty() ?: false }
        .let(::println)

    somalazy(1, 5) {
        println(it)
    }


    //teste de autenticacao com highorder
    //entraHighOrder
    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }
    SistemaInterno().entraHighOrder(autenticavel, senha = 1234) {
        println("Fazer pagamento")
    }

    //scope functions
}

fun testeRecebeString(valor:String){

}

fun somalazy(a:Int,b:Int,resultado:(Int)->Unit){
    resultado(a+b)//somente com essa implantacao o resultado tem valor, esse tipo de implemantacao [e muito usado em programcao orientada a eventos

}

