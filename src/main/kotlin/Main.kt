//Comandos
// ctrl+alt+l identa o codigo
// https://github.com/alura-cursos/kotlin-introducao-orientacao-a-objetos
//ctrl+alt+m extract method ao selecionar o codigo permite criar uma funcao com a parte selecionada
// ctrl+d duplica a linha

fun main() {
    println("Bem vindo ao byteBank")
   // testaComportamentoConta()

    val alex =Funcionario(
        nome= "Alex",
        cpf="111.111.111-11",
        salario=1000.0,
        tipo = 0
    )
    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacao ${alex.bonificacao()}")

}



fun deposito(conta:Conta,valor:Double){
   // conta.setSaldo(conta.getSaldo()+valor)
}


