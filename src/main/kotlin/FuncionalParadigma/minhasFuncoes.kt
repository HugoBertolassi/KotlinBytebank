package FuncionalParadigma

fun minhasFuncoes() {
    //println(soma(1,5))

    //TIPO FUNCAO -OLHAR NA DOC MIGRANDO DO PYTHON
    //tipo funcao habilita a variavel funcionar como uma funcao
    //Sintase variavel:entrada->tipo de resposta
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao)
    println(minhaFuncao())
    val minhaFuncaoSoma: (Int, Int) -> Int = ::soma
    println(minhaFuncaoSoma(1, 2))

    //Pode vir de classe
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
    val minhaFuncaoSomaClasse: (Int, Int) -> Int = TestSoma()
    println(minhaFuncaoSomaClasse(1, 2))
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