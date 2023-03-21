package FuncionalParadigma

fun minhaFuncaoLambda() {
    //Funcao lambda
    val minhaFuncaoLambda: () -> Unit = {
        println("Executa funcao lambida")//padrao da lambda eh retornar o ultmo parametro
    }
    println(minhaFuncaoLambda())
    val minhaFuncaoLambdaSoma: (Int, Int) -> Int = { a, b ->
        a + b
    }
    println("Funcao lambda soma ${minhaFuncaoLambdaSoma(15, 10)}")

    //lambda com mais de um retorno
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000) {
            return@lambda salario + 50.0  //lambda 'e o nome da label que eh chamada
        }
        salario + 100.0
    }
    println(calculaBonificacao(1000.0))
}
