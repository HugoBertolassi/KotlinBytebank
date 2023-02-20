import modelo.Endereco

//Comandos
// ctrl+alt+l identa o codigo
// https://github.com/alura-cursos/kotlin-introducao-orientacao-a-objetos
//ctrl+alt+m extract method ao selecionar o codigo permite criar uma funcao com a parte selecionada
// ctrl+d duplica a linha
//f5 em cima de um arquivo cria a copia
//alt+ 1 seleciona tela do projeto
// alt+insert adiciona arquivo
//ctrl +n abre um menu de navegacao
//ctrl+alt+o otimizador de pacotes e limpeza de testes

//object declaration
//diferenca com expression: tem nome
//object contador{
//    var total=0;
//}

fun main() {
    println("Bem vindo ao byteBank")
    //val palavra: String = "texto"
    //val palavraJava: java.lang.String = java.lang.String("texto")
    //testaComportamentoConta()
    //teste.testaFuncionarios()
//    teste.testaContasDiferentes()
//    testaObjetos()
    //teste.testaAutenticacao()
 //   testaAutenticacaoTipoFuncionario()

//val endereco =Endereco()
    //teste de impressoes de any
//    imprime(Unit)//unit eh um objeto que nao tem retorno
//    imprime(1)
//    imprime(1.0)
//    imprime(endereco)
    val endereco = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-0700"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-0700"
    )
    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco)
    println(enderecoNovo)
    println("${endereco.javaClass}@${
        Integer.toHexString(endereco.hashCode())}")

}
fun imprime(valor:Any):Unit{
    println(valor)
}




