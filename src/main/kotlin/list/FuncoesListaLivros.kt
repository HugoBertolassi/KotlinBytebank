package list

fun List<Livro?>.imprimeComMarcadores(){
    val textoFormatado:String = this
       // .filter { it!=null }
        .filterNotNull()
        .joinToString(separator = "\n") { it ->
            "- ${it.titulo} de ${it.autor}"
        }
    println("#### Lista de livros #### \n${textoFormatado}")
}