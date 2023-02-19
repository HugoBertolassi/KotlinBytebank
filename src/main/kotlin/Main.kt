
import modelo.Autenticavel
import modelo.SistemaInterno

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
    teste.testaContasDiferentes()

    //criacao de object expression, objeto anonimo https://kotlinlang.org/docs/object-declarations.html
    val fran = object:Autenticavel {
        val nome:String="fran"
        val cpf:String="123"
        override val senha:Int=12

        override fun autentica(senha:Int)=this.senha==senha
    }

    val sistemaInterno=SistemaInterno()
    sistemaInterno.entra(fran,12)
    println("Cliente ${fran.nome}")





    //teste.testaAutenticacao()


}





