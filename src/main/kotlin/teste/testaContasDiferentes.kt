package teste

import modelo.Cliente
import modelo.Conta
import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente("Alex","12",12),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente("fran","123",123),
        numero = 1001
    )

    contaCorrente.deposito(1000.0)
    contaPoupanca.deposito(1000.0)
    contaCorrente.saque(100.0)
    contaPoupanca.saque(100.0)

    println("Saldo da conta do ${contaCorrente.titular.nome} eh ${contaCorrente.saldo}")
    println("Saldo da conta do ${contaPoupanca.titular.nome} eh ${contaPoupanca.saldo}")

    contaCorrente.transferencia(valor = 100.0, destino = contaPoupanca)

    println("Saldo da conta apos transferir do ${contaCorrente.titular.nome} eh ${contaCorrente.saldo}")
    println("Saldo da conta apos  receber transferencia do ${contaPoupanca.titular.nome} eh ${contaPoupanca.saldo}")
}


fun deposito(conta: Conta, valor:Double){
    // conta.setSaldo(conta.getSaldo()+valor)
}