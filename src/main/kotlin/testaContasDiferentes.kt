fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposito(1000.0)
    contaPoupanca.deposito(1000.0)
    contaCorrente.saque(100.0)
    contaPoupanca.saque(100.0)

    println("Saldo da conta do ${contaCorrente.titular} eh ${contaCorrente.saldo}")
    println("Saldo da conta do ${contaPoupanca.titular} eh ${contaPoupanca.saldo}")

    contaCorrente.transferencia(valor = 100.0, destino = contaPoupanca)

    println("Saldo da conta apos transferir do ${contaCorrente.titular} eh ${contaCorrente.saldo}")
    println("Saldo da conta apos  receber transferencia do ${contaPoupanca.titular} eh ${contaPoupanca.saldo}")
}


fun deposito(conta:Conta,valor:Double){
    // conta.setSaldo(conta.getSaldo()+valor)
}