package teste

import modelo.*

fun testaAutenticacaoTipoFuncionario() {
    val gerente = Gerente(
        nome = "alex",
        cpf = "1",
        salario = 1000.0,
        senha = 123
    )
    val diretor = Diretor(
        nome = "joao",
        cpf = "1",
        salario = 1000.0,
        senha = 123,
        plr = 100.0
    )
    val  cliente = Cliente(
        nome="gui",
        cpf="3",
        senha = 123
    )
    val  analista= Analista(
        nome="jao",
        cpf="4",
        salario = 1000.0,
        senha = 123
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 123)
    sistema.entra(diretor, 123)
    sistema.entra(cliente, 123)
    sistema.entra(analista, 123)


//    diretor.autentica(123)
}
