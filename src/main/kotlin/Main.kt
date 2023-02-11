//Comandos
// ctrl+alt+l identa o codigo
// https://github.com/alura-cursos/kotlin-introducao-orientacao-a-objetos
fun main() {
    println("Bem vindo ao byteBank")
    val contaAlex = Conta("alex",101)
    //contaAlex.titular="alex"

    val contaFran =Conta("fran",102)
    //contaFran.titular="fran"
    contaFran.setSaldo(25.0)
    println("a " + contaAlex.titular)
    println("a " + contaFran.titular)

    println("depositando na fran")
    contaFran.deposito(50.0)
    println("O saldo da fran e ${contaFran.saldo}")

    println("Saque na fran")
    contaFran.saque(100.0)
    println("O saldo da fran e ${contaFran.saldo}")

    println("transferencia na fran")
    if(contaFran.transferencia(50.0,contaAlex)){
        println("Transferencia com sucesso")
    }else{
        println("Transferencia negada")
    }
    println("O saldo da fran e ${contaFran.saldo}")
    println("O saldo do Alex e ${contaAlex.saldo}")


}


fun testaLacos(){
    val ola = "ola" //Same as const
    //laco for
    //for (i in 1..5) {
    for (i in 5 downTo 1 step 2 ) {

        if(i==4){//
            break
            continue// vai para o proximo
        }
        val titular: String = "Hugo + $i" //permite variar
        val numeroConta: Int = 13456 + i;
        var saldo: Double = -10.0 + i
        saldo = saldo + 10

        println("")
        println("titular " + ola)//kotin mostra como pode melhorar  codigo com a marcação
        println("titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")

        testaCondicoes(saldo)
    }

    var cont =5;
    while(cont >0){
        println(cont)
        cont--
    }
}

fun deposito(conta:Conta,valor:Double){
   // conta.setSaldo(conta.getSaldo()+valor)
}
class Conta{
    var titular= ""
    var numero  =   0
    var saldo = 0.0
        private set//deixa somente ser modificado o valor internamente
        //private set(valor){field=valor}//field eh o proprio campo assim eh possivel fazer uma validacao no set se desejar

    constructor(titular:String,numero:Int){
        this.titular=titular
        this.numero=numero
    }
    fun deposito(valor:Double){
        if(valor>0){
            this.saldo+=valor
        }

    }

    fun saque(valor:Double){
        if(this.saldo>=valor){
            this.saldo-=valor
        }
    }

    fun transferencia(valor:Double,destino:Conta):Boolean{
        if(this.saldo>=valor){
            this.saldo-=valor
            destino.deposito(valor)
            return true
        }
        return false
    }

    //fun getSaldo():Double{ return this.saldo }

    fun setSaldo(valor:Double){
        this.saldo=valor
    }
}

//estrura if, when
fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("conta positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta negtativa")
    }

    //estrutura when
    when {
        saldo > 0.0 -> {
            println("conta positiva")
        }

        saldo == 0.0 -> {
            println("conta neutra")
        }

        else -> {
            println("conta negativa")
        }
    }

    //when simplificado
    when {
        saldo > 0.0 -> println("conta positiva")
        saldo == 0.0 -> println("conta neutra")
        else -> println("conta negativa")
    }
}