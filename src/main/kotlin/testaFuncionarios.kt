fun testaFuncionarios(){
    val alex =Analista(
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

    var calculadora=CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    println("O total de bonificação é ${calculadora.total}")

}