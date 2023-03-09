package collection

fun testaMap(pedidos:MutableMap<Int,Double>) {
    //map(

    println(pedidos)
    println(pedidos[1])//pega o valor a partir da chave por isso eh bom fazer um null safety
    println(pedidos[0] ?: "nao encontrado")
    val pedido = pedidos[0]
    pedido?.let {
        println("pedido $it")//se nao encontrar nao vai imprimir
    }

    //laco for para map
    for (p in pedidos) {
        println(" O numero do pedido eh ${p.key} com valor ${p.value} ")
    }

    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.00)//cria ou atualiza o map
    pedidos.putIfAbsent(6, 100.00)//adiciona se nao existitr

    val pedidos: MutableMap<Int, Double> =
        mutableMapOf(
            Pair(1, 20.0),
            Pair(2, 34.0),
            3 to 50.0,
            4 to 10.0
        )//O infix utilizando "to" tem perda de performance
    //testaMap(pedidos)

    val valorPedido= pedidos.getValue(3)
    val mensagem:Double?=pedidos.getOrElse(0,{
        0.00
    })
    println(mensagem)

    val pedidosFiltrados=pedidos.filter { (numero,valor)->
        numero %2==0 && valor>20.0
    }
    println(pedidosFiltrados)
}

fun testaMap2(){
    val pedidos: MutableMap<Int, Double> =
        mutableMapOf(
            Pair(1, 20.0),
            Pair(2, 34.0),
            3 to 50.0,
            4 to 10.0
        )//O infix utilizando "to" tem perda de performance
    //testaMap(pedidos)

    val valorPedido= pedidos.getValue(3)
    val mensagem:Double?=pedidos.getOrElse(0,{
        0.00
    })
    println(mensagem)

    val pedidosFiltrados=pedidos.filter { (numero,valor)->
        numero %2==0 && valor>20.0
    }
    println(pedidosFiltrados)
}
