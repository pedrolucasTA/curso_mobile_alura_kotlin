fun testaContasDiferentes() {
    val contaCorrentePedro = ContaCorrente(
        titular = "Pedro",
        numero = 9999
    )

    val contaPoucancaLucas = ContaPoucanca(
        titular = "Lucas",
        numero = 8888
    )

    contaCorrentePedro.deposita(1000.00)
    contaPoucancaLucas.deposita(1000.00)

    contaCorrentePedro.saca(50.00)
    println("saldo conta corrente pedro ${contaCorrentePedro.saldo}")

    contaPoucancaLucas.saca(50.00)
    println("saldo conta poupança lucas ${contaPoucancaLucas.saldo}")

    contaCorrentePedro.transfere(50.0, contaPoucancaLucas)
    println("saldo conta corrente pedro ${contaCorrentePedro.saldo}")
    println("saldo conta poupança lucas ${contaPoucancaLucas.saldo}")

    contaPoucancaLucas.transfere(50.00, contaCorrentePedro)
    println("saldo conta corrente pedro ${contaCorrentePedro.saldo}")
    println("saldo conta poupança lucas ${contaPoucancaLucas.saldo}")
}