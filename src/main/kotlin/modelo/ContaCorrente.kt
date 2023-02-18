package modelo

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saque(valor:Double){
        val taxa=0.1
        if(this.saldo>=valor){
            val valorComTaxa= valor + taxa
            this.saldo -= valorComTaxa
        }
    }



}