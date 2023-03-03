package list

fun testaListaDelivros(){
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val meusLivros: MutableList<Livro> =
        mutableListOf(livro1, livro2, livro3, livro4)


    println(meusLivros)

    val livro5 = Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    )

    //adicionar livro
    meusLivros.add(livro5)
    println(meusLivros)

    //remover livro
    meusLivros.remove(livro1)
    println(meusLivros)

    //meusLivros.imprimeComMarcadores()

    val oredenadoPorAnoPublicaca:List<Livro> = meusLivros.sorted()//o sorted vai puxar o que esta na funcao compare da classe
    //oredenadoPorAnoPublicaca.imprimeComMarcadores()
    val ordenadoPorTitulo= meusLivros.sortedBy { it.autor }.imprimeComMarcadores()
    //println("lista delivro ordenada or titulo ${ordenadoPorTitulo}")

    meusLivros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    val titulos:List<String> = meusLivros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
    println(titulos)


}
