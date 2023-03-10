package collection

fun collectionModule(){
    //testaCollection()
    //testaSetAndCollection()
    //testaMap2()

    //associate
  val pedidos=  listOf(
        Pedido(1,20.00),
        Pedido(2,30.00),
        Pedido(3,30.00)
    )

    println(pedidos)
    val pedidosMapeados:Map<Int,Pedido> = pedidos.associate { pedido:Pedido->
        Pair(pedido.numero,pedido)
    }
    val pedidosMapeados2:Map<Int,Pedido> = pedidos.associateBy { pedido:Pedido->
        pedido.numero //so precisa informar a chave que j[a vai fazer o pair
    }
    println(pedidosMapeados)
}


data class Pedido(val numero:Int, val valor:Double)