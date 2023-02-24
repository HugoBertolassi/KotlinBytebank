package teste

import exception.FalhaAutenticacaoException
import exception.SaldoInsuficienteException
import modelo.*

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome="Alex",
            cpf="12",
            senha=12,
            endereco = Endereco(
                logradouro = "rua das garcas",
                bairro = "bairros das rosas",
                numero = 10,
                cidade = "campo grande",
                estado = "ms",
                cep ="10010"

                )
        ),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome="fran",
            cpf="123",
            senha=123),
        numero = 1001
    )

    contaCorrente.deposito(1000.0)
    contaPoupanca.deposito(1000.0)
    contaCorrente.saque(100.0)
    contaPoupanca.saque(100.0)

    println("cliente:${contaCorrente.titular.nome}")
    println("Cpf:${contaCorrente.titular.cpf}")
    println("endereco:rua ${contaCorrente.titular.endereco.logradouro},${contaCorrente.titular.endereco.numero}")
    println("cliente:${contaCorrente.titular.nome}")
    println("Saldo da conta do ${contaCorrente.titular.nome} eh ${contaCorrente.saldo}")
    println("Saldo da conta do ${contaPoupanca.titular.nome} eh ${contaPoupanca.saldo}")

    try {
        contaCorrente.transferencia(
            valor = 100.0,
            destino = contaPoupanca,
            senha=12)
    }
    catch (e:SaldoInsuficienteException){
        println("Saldo Insuficiente para fazer a transferencia")
        e.printStackTrace()
    }
    catch (e:FalhaAutenticacaoException){
        println("Falha na transferencia")
        println("Falha na autentitcacao")
        e.printStackTrace()
    }
    catch(e:Exception){
        println("Erro desconhecido")
        e.printStackTrace()
    }
    println("Saldo da conta apos transferir do ${contaCorrente.titular.nome} eh ${contaCorrente.saldo}")
    println("Saldo da conta apos  receber transferencia do ${contaPoupanca.titular.nome} eh ${contaPoupanca.saldo}")


    println("O total de contas criadas é ${Conta.total}")
}


fun deposito(conta: Conta, valor:Double){
    // conta.setSaldo(conta.getSaldo()+valor)
}