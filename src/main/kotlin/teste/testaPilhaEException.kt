package teste

import exception.SaldoInsuficienteException
import modelo.Endereco

fun testaPilhaEException(){
    //teste de pilha de execucao
    println("início main")
    funcao1()

    val entrada:String="1,0"

    val valorRecebido:Double?=try{
        entrada.toDouble()
    }
    catch (e:NumberFormatException){
        println("Problema na conversao")
        e.printStackTrace()
        null
    }
    //if expresion, libera receber o valor com nulo
    val valorComTaxa:Double? = if(valorRecebido !=null){
        valorRecebido+0.1
    }else{
        null
    }

    if (valorRecebido!= null){
        println("Valor recebido $valorRecebido")
    }
    else{
        println("valor invalido")
    }
    println("fim main")

}

fun funcao1(){
    println("início funcao1")
    funcao2()


    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    val endereco = Any()

    for (i in 1..5) {
        println(i)
        try {
            //Criar exception
            //throw ArithmeticException()
            // throw SaldoInsuficienteException()
            endereco as Endereco//cria erro

        }
        catch (e:ClassCastException){
            println("Pegou a ClassCastException")
            println("error message")
            println(e.message)
            println("error stckTrace")
            println(e.stackTrace)
            println("error cause")
            println(e.cause)
            println("printStackTrace")
            e.printStackTrace()

        }
        catch (e: SaldoInsuficienteException){
            println("Saldo insuficiente exception foi ppegada")
        }
    }
    println("fim funcao2")
}
