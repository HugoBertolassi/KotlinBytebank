package collection

fun testaSetAndCollection() {
    //Adicao de listas
    val viramCursoAndroid = setOf<String>("alex", "Fran", "Gui", "joao")
    val viramCursoKotlin = listOf<String>("alex", "paulo", "jose", "joao")

    //adicao 1
    val viramAmbos = mutableListOf<String>()
    viramAmbos.addAll(viramCursoAndroid)
    viramAmbos.addAll(viramCursoKotlin)
    //adicao 2
    val viramAmbos2 = viramCursoKotlin + viramCursoAndroid

    println(viramAmbos.distinct())
    println(viramAmbos2.distinct())
    //lista permite pegar o indice, permite o mesmo elemento mais de uma vez
    println(viramAmbos2[1])

    //set nao permite duplicado e ordem nao importa
    val viramCursoAndroidSet = setOf<String>("alex", "Fran", "Gui", "joao")
    val viramCursoKotlinSet = setOf<String>("alex", "paulo", "jose", "joao")
    val viramAmbosSet = viramCursoAndroidSet + viramCursoKotlinSet //operator overloading.
    val viramAmbosSetUnion = viramCursoAndroidSet union viramCursoKotlinSet
    val viramAmbosSetSubtract = viramCursoAndroidSet subtract viramCursoKotlinSet
    val viramAmbosSetintersect = viramCursoAndroidSet intersect viramCursoKotlinSet

    val assistiramList: MutableList<String> = viramCursoAndroid.toMutableList()
    assistiramList.add("alex")//por ter mudado volta a aceitar duplicados

    println(viramAmbosSet)
    println(viramAmbosSetUnion)
}
