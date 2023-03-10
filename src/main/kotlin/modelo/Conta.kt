package modelo

import exception.FalhaAutenticacaoException
import exception.SaldoInsuficienteException


//var totalconta:Int =0
//    private set
abstract class Conta(
    var titular:Cliente,
    var numero:  Int
):Autenticavel{
    var saldo = 0.0
        protected set//deixa somente ser modificado o valor internamente
        //private set(valor){field=valor}//field eh o proprio campo assim eh possivel fazer uma validacao no set se desejar

    //isso é um object declaration, perite aramazernar um valor unico para toda a clase substituindo uma variavel global
    // a palavra companion libera a utilização como se o object declaration fosse uma property do contador, podendo ser acessado de forma unica pela clasee e nao pelas filhas
   companion object Contador{
        var total=0
            private set
        fun incrementa(){
            total++
        }

    }

//    constructor(titular:String,numero:Int){
//        this.titular=titular
//        this.numero=numero
//    }

    //toda vez que inicia  objeto faz essa funcao
    init{
        println("criando conta")
        Contador.total++
     //   totalconta++
    }

    fun deposito(valor:Double){
        if(valor>0){
            this.saldo+=valor
        }

    }

    abstract fun saque(valor:Double)
//    {
//        if(this.saldo>=valor){
//            this.saldo-=valor
//        }
//    }

    //delega para classe filha a necessidade de autenticar

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }
    fun transferencia(valor:Double,destino: Conta, senha: Int):Boolean{

        if(this.saldo<valor){
            throw SaldoInsuficienteException(
                mensagem = "Saldo insuficiente, o valor a ser transferido R$ $valor é superior ao saldo ${this.saldo} "
            )
        }
        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }
       // throw NumberFormatException()
        this.saldo-=valor
        destino.deposito(valor)
        return true
    }

    //fun getSaldo():Double{ return this.saldo }

    //a config de acesso a propriedade foi setada apos o constructor
//    fun setSaldo(valor:Double){
//        this.saldo=valor
//    }

    open fun saque() {}
}