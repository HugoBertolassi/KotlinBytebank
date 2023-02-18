package modelo

abstract class Conta(
    var titular:Cliente,
    var numero:  Int
){
    var saldo = 0.0
        protected set//deixa somente ser modificado o valor internamente
        //private set(valor){field=valor}//field eh o proprio campo assim eh possivel fazer uma validacao no set se desejar

//    constructor(titular:String,numero:Int){
//        this.titular=titular
//        this.numero=numero
//    }
    fun deposito(valor:Double){
        if(valor>0){
            this.saldo+=valor
        }

    }

    abstract fun saque(valor:Double)
//    {
//        if(this.saldo>=valor){
//            this.saldo-=valor
//        }
//    }

    fun transferencia(valor:Double,destino: Conta):Boolean{
        if(this.saldo>=valor){
            this.saldo-=valor
            destino.deposito(valor)
            return true
        }
        return false
    }

    //fun getSaldo():Double{ return this.saldo }

    //a config de acesso a propriedade foi setada apos o constructor
//    fun setSaldo(valor:Double){
//        this.saldo=valor
//    }

    open fun saque() {}
}