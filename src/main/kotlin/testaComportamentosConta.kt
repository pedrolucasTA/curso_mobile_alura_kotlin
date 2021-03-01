fun testaComportamentosConta() {
    val contaPedro = ContaCorrente(titular = "Pedro", numero = 1000)
    contaPedro.deposita(200.00)

    val contaLucas = ContaPoucanca(numero = 1001, titular = "Lucas")
    contaLucas.deposita(300.00)

    println(contaLucas.titular)
    println(contaLucas.numero)
    println(contaLucas.saldo)

    println(contaPedro.titular)
    println(contaPedro.numero)
    println(contaPedro.saldo)

    println("depositando na conta do Pedro")
    contaPedro.deposita(50.0)
    println("saldo ${contaPedro.saldo}")

    println("Sacando na conta do Pedro")
    contaPedro.saca(40.0)
    println("saldo ${contaPedro.saldo}")

    println("Transferindo da conta do Lucas para Pedro")

    if (contaLucas.transfere(valor = 400.0, destino = contaPedro)) {
        println("Transferência realizada com sucesso")
    } else {
        println("Não foi possível realizar a transferência")
    }

    println("saldo ${contaPedro.saldo}")
    println("saldo ${contaLucas.saldo}")

}

