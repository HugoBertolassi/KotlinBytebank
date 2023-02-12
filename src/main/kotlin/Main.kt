//Comandos
// ctrl+alt+l identa o codigo
// https://github.com/alura-cursos/kotlin-introducao-orientacao-a-objetos
//ctrl+alt+m extract method ao selecionar o codigo permite criar uma funcao com a parte selecionada
// ctrl+d duplica a linha
//f5 em cima de um arquivo cria a copia
fun main() {
    println("Bem vindo ao byteBank")
   // testaComportamentoConta()

    val alex =Funcionario(
        nome= "Alex",
        cpf="111.111.111-11",
        salario=1000.0
    )
    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacao ${alex.bonificacao()}")

    val fran = Gerente("Fran","222.222.222-22",2000.0,1234)

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificacao ${fran.bonificacao()}")

    val gui = Diretor("Gui","222.222.222-22",4000.0,1234, plr = 200.0)

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificacao ${gui.bonificacao()}")


}



fun deposito(conta:Conta,valor:Double){
   // conta.setSaldo(conta.getSaldo()+valor)
}


