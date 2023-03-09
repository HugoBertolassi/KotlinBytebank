package collection


fun testaCollection() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
//    banco.nomes.add("Alex")
    banco.salva("Alex")
    //println(banco.nomes)
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {

    //   val nomes: Collection<String> get() = dados //colocar no toList gera uma copia real dos dados
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String){
        dados.add(nome)
    }
    companion object {//ao colcar a variavel aqui, ela vira uma variavel mutavel da classe, ou seja ela salva a lista idependente quando a classe for chamada
    private val dados = mutableListOf<String>()
    }
}
fun testaColecction(){
    //uma lista pertence a uma collection que pertence ao interator

    //val nomes:List<String> = listOf(
    val nomes:Collection<String> = listOf(
        //val nomes:Iterable<String> = listOf(//iterable não tem o método size por exemplo
        "Alex",
        "Paulo",
        "Fran",
        "Gui",
        "Ana",
        "Maria"
    )

    for (nome in nomes.iterator()){
        println(nome)
        println("Tem o nome Alex: ${nome.contains("Alex")}")
        println("Tamanho da lista: ${nomes.size}")
    }
}