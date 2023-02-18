package teste

import modelo.Cliente
import modelo.Diretor
import modelo.Gerente
import modelo.SistemaInterno

fun testaAutenticacao() {
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

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 123)
    sistema.entra(cliente, 123)

//    diretor.autentica(123)
}
