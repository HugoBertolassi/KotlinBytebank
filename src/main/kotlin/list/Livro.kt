package list
//data class fornece metodos novos
data class Livro  (
    val titulo:String,
    val autor:String,
    val anoPublicacao:Int,
    val editora:String?=null
):Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }
}