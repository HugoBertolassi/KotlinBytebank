package exception

//para lancar excepion é necessario que ela seja uma classe e sufixo exception

//tipo throwable é um tipo mais abrangente de erro, entao o tipo da funcao é indicado ser exception
//class SaldoInsuficienteException: Throwable("Saldo Isuficiente")
class SaldoInsuficienteException: Exception("Saldo Isuficiente")