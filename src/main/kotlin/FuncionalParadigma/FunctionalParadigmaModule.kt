package FuncionalParadigma

fun FuncionalParadigma(){
    //println(soma(1,5))

    //TIPO FUNCAO -OLHAR NA DOC MIGRANDO DO PYTHON
    //tipo funcao habilita a variavel funcionar como uma funcao
    //Sintase variavel:entrada->tipo de resposta
    val minhaFuncao : ()-> Unit = ::teste
    println(minhaFuncao)
    println(minhaFuncao())
    //Pode vir de classe
    val minhaFuncaoClasse:()-> Unit = Teste()
    println(minhaFuncaoClasse())

    //Funcao lambda
    val minhaFuncaoLambda:()-> Unit = {
        println("Executa funcao lambida")
    }
    println(minhaFuncaoLambda())

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