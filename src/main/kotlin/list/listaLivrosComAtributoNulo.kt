package list

fun main(){
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


    meusLivros
        .groupBy { it.editora ?: "Editora desconhecida"} //elves operator
        .forEach{(editora:String?,livros:List<Livro>)->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}