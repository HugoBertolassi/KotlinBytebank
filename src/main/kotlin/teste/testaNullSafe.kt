package teste

fun testaNullSafe(){
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