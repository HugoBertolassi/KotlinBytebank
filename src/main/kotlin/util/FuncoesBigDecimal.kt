package util

import java.math.BigDecimal
import java.math.RoundingMode

fun bigDecimalArrayOf(vararg valores:String):Array<BigDecimal>{
    return Array<BigDecimal>(valores.size){ i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {//extension function
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.average():BigDecimal{
    return if(this.isEmpty()){
        BigDecimal.ZERO
    }else{
        (this.somatoria()/this.size.toBigDecimal()).setScale(2,RoundingMode.UP)
    }

}