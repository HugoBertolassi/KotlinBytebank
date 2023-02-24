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
//ctrl+p dentro de uma funcao mostra os valores que ela contem

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
    //teste.testaContasDiferentes()
//    testaObjetos()
    //teste.testaAutenticacao()
 //   testaAutenticacaoTipoFuncionario()

   // testaAny()
    //teste.testaPilhaEException()

    //teste de nulos
    var enderecoNulo:modelo.Endereco?=null
    //val enderecoNaoNulo: Endereco = enderecoNulo!! //!! non-null assertion as duas exclmacoes faz com que permita  atribuir o valor nulo, porem pode dar um erro na execucao
    //enderecoNaoNulo.logradouro

    //safe call [e colocar a interrogacao no valor, se for verdadeiro printa, evita ter que fazer if
    println(enderecoNulo?.bairro)
    enderecoNulo?.let{//usando o let nao eh necessario colocar o? em tudo
        println(it.logradouro.length)
        //elvis operator, funciona que se o valor for invalido ele pega o outro, s[o se o valor for nulo
        //val tamanhoComplemento:Int=it.logradouro?.length ?: 0
        val tamanhoComplemento:Int=it.complemento?.length ?: throw IllegalStateException("Complemento nao pode ser vazio")
        println(tamanhoComplemento)
    }



}




