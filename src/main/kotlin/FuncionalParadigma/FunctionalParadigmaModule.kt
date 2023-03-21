package FuncionalParadigma

fun FuncionalParadigma(){
    //println(soma(1,5))

    //TIPO FUNCAO -OLHAR NA DOC MIGRANDO DO PYTHON
    //tipo funcao habilita a variavel funcionar como uma funcao
    //Sintase variavel:entrada->tipo de resposta
    val minhaFuncao : ()-> Unit = ::teste
    println(minhaFuncao)
    println(minhaFuncao())
    val minhaFuncaoSoma : (Int,Int)-> Int = ::soma
    println(minhaFuncaoSoma(1,2))

    //Pode vir de classe
    val minhaFuncaoClasse:()-> Unit = Teste()
    println(minhaFuncaoClasse())
    val minhaFuncaoSomaClasse : (Int,Int)-> Int = TestSoma()
    println(minhaFuncaoSomaClasse(1,2))

    //Funcao lambda
    val minhaFuncaoLambda:()-> Unit = {
        println("Executa funcao lambida")//padrao da lambda eh retornar o ultmo parametro
    }
    println(minhaFuncaoLambda())
    val minhaFuncaoLambdaSoma:(Int,Int)-> Int = { a,b ->
        a+b
    }
    println("Funcao lambda soma ${minhaFuncaoLambdaSoma(15,10)}")

    //lambda com mais de um retorno
    val calculaBonificacao:(salario:Double)->Double=lambda@{salario->
        if(salario>1000){
            return@lambda salario + 50.0  //lambda 'e o nome da label que eh chamada
        }
        salario+100.0
    }
    println(calculaBonificacao(1000.0))
}

fun soma(a:Int,b:Int):Int=a+b

fun teste(){
    println("executa teste")
}


class Teste: () -> Unit{
    override fun invoke() {
        println("executa invoke da Calsse Teste")
    }
}
class TestSoma(): (Int,Int) -> Int{
    override fun invoke(a: Int, b: Int): Int= a+b
}