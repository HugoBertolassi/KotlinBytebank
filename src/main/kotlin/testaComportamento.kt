fun testaComportamentoConta() {
    val contaAlex = Conta("alex", 101)
    //contaAlex.titular="alex"

    val contaFran = Conta("fran", 102)
    //contaFran.titular="fran"
    contaFran.setSaldo(25.0)
    println("a " + contaAlex.titular)
    println("a " + contaFran.titular)

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