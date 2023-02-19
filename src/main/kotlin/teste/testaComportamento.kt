package teste

import modelo.Cliente
import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaComportamentoConta() {
    val alex=Cliente(nome="alex", cpf = "12", senha = 1)
    val contaAlex = ContaCorrente(alex, 101)
    //contaAlex.titular="alex"

    val contaFran = ContaPoupanca(Cliente(nome="fran", cpf = "123", senha = 2), 102)
    //contaFran.titular="fran"
    contaFran.deposito(25.0)
    println("a " + contaAlex.titular.nome)
    println("a " + contaFran.titular.nome)

    println("depositando na fran")
    contaFran.deposito(50.0)
    println("O saldo da fran e ${contaFran.saldo}")

    println("Saque na fran")
    contaFran.saque(100.0)
    println("O saldo da fran e ${contaFran.saldo}")

    println("transferencia na fran")
    if (contaFran.transferencia(50.0, contaAlex)) {
        println("Transferencia com sucesso")
    } else {
        println("Transferencia negada")
    }
    println("O saldo da fran e ${contaFran.saldo}")
    println("O saldo do Alex e ${contaAlex.saldo}")
}