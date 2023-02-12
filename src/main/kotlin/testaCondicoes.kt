//estrura if, when
fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("conta positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta negtativa")
    }

    //estrutura when
    when {
        saldo > 0.0 -> {
            println("conta positiva")
        }

        saldo == 0.0 -> {
            println("conta neutra")
        }

        else -> {
            println("conta negativa")
        }
    }

    //when simplificado
    when {
        saldo > 0.0 -> println("conta positiva")
        saldo == 0.0 -> println("conta neutra")
        else -> println("conta negativa")
    }
}