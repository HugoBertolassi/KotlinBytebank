package teste

import modelo.Endereco

fun testaAny() {
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
    println(
        "${endereco.javaClass}@${
            Integer.toHexString(endereco.hashCode())
        }"
    )
}

fun imprime(valor:Any):Unit{
    println(valor)
}
