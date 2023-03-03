package teste

import util.average
import util.bigDecimalArrayOf
import util.somatoria
import java.math.BigDecimal
import java.math.RoundingMode

fun testeArray() {
    //Array
    //tem que setar o tmanho
    val idades = IntArray(4)
    idades[0] = 20
    idades[1] = 25
    idades[2] = 30
    idades[3] = 21

    //maneira 2 de criar array, nao precsa setar o tamanho assim
    val idades2: IntArray = intArrayOf(10, 15, 16, 20)

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println(maiorIdade)
    //for com o indice
    for (indice in idades.indices) {
        idades[indice] += 1
        if (idades[indice] > maiorIdade) {
            maiorIdade = idades[indice]
        }
    }
    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades2.forEach { idade ->

        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println(menorIdade)

    idades2.forEachIndexed { index, idade ->
        idades2[index] = idade + 1
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println(menorIdade)


    //range
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("${s} ")
    }
    println("")
    //range 2
    //val numerosPares =0..100 step 2
    //val numerosPares =0.until(100)//dessa forma nao inclui o 100
    val numerosPares = 100 downTo 0 step 2//faz o loop reverso
    for (numeroPar in numerosPares) {
        print("${numeroPar} ")
    }
    println("")

    //exwmplo busca
    val intervalo = 1500.00..5000.00
    val salario = 4000.00
    if (salario in intervalo) {
        println(" Salario encontrado dentro do intervalo")
    } else println("Salario n'ao encontrado")

    //operacao agregadora
    val idadesAlunos: IntArray = intArrayOf(10, 20, 30, 25)
    //val resIdadeAlunos=idadesAlunos.max()
    //val resIdadeAlunos=idadesAlunos.min()
    //val resIdadeAlunos=idadesAlunos.average()
    //val resIdadeAlunos=idadesAlunos.all { it>18 }//valida todos os elementos retorna boolean
    //val resIdadeAlunos=idadesAlunos.any { it>18 }//valida se alguem eh maior de idade
    //val resIdadeAlunos=idadesAlunos.filter { it>18 }//traz uma lista dos valores encontrados
    //val resIdadeAlunos=idadesAlunos.find { it>5 }//traz uma o primeiro valor encontrado
    val resIdadeAlunos = idadesAlunos.firstOrNull() { it > 5 }//traz uma o primeiro valor encontrado

    println("$resIdadeAlunos")


    //Tratamentos de bigdecimal

    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
    salarios[0] = "1500.50".toBigDecimal()
    salarios[1] = "2000.50".toBigDecimal()
    println(salarios.contentToString())

    val salarios2 = bigDecimalArrayOf("1550.00", "2000.50")
    println(salarios2.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosAumento: Array<BigDecimal> = salarios2
        .map { salario ->
            //    (salario*aumento).setScale(2,RoundingMode.UP)
            calculaAUmentoRelativo(salario, aumento)
        }
        .toTypedArray()

    println(salariosAumento.contentToString())

    //reduce
    //saber quanto ele vai gastar com todos os funcionarios e nos proximos 6 meses
    intArrayOf(1, 2, 3).sum()//retorna a somatoria do array

    val gastoInicial = salariosAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gasto6meses = salariosAumento
        .fold(gastoInicial) { acumulador, salario ->//fold soma os valores no acumalor e retorn o acumalador
            acumulador + (salario * meses).setScale(2, RoundingMode.UP)
        }
    println(gasto6meses)

    val mediaTresMaioresSalarios: BigDecimal = salariosAumento
        .sorted()//ordena padrao do menor para o maior
        .takeLast(3).toTypedArray()//pega os ultimos
        .average()
    println(mediaTresMaioresSalarios)
}

private fun calculaAUmentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salario < "5000".toBigDecimal()) {
        salario + "500.00".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}

