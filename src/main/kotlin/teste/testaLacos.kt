package teste

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