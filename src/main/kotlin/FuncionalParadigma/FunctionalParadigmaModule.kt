package FuncionalParadigma

import modelo.Cliente
import modelo.ContaPoupanca
import modelo.Endereco

fun FuncionalParadigma(){
    //minhasFuncoes()
    //minhaFuncaoLambda()

    //testaScopeFunctions()
    //testaWith()

    //teste de HighOrderfunction RUn
    val taxaAnual=0.05
    val taxaMensal=taxaAnual/12
    Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 123)
        .let { clienteaNovo->
            ContaPoupanca(clienteaNovo,numero=111)
        }.run {
            deposito(100.0)
            //println(saldo)
            saldo*taxaMensal//retorna por ser o ultimo valor
        }.let { rendimentoMensal->
            println(rendimentoMensal)
        }
    val contaPoupanca = ContaPoupanca(Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 123),100)
    contaPoupanca.run {
        deposito(1000.0)
        saldo*taxaMensal
    }.let { rendimentoMensal->
    println("Rendimento mensal $rendimentoMensal")
    }

   val rendimentoAnual= run{
        var saldo=contaPoupanca.saldo
        repeat(12){
            saldo += saldo*taxaMensal
        }
        saldo
    }
    println("Rednimento anual $rendimentoAnual")



}

fun testaWith() {
    with(Endereco()) {
        logradouro = "rua vergs"
        numero = 1010
        bairro = "Vila,Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "casa"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}
