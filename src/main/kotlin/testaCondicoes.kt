fun testaCondicoes(saldo: Double) {

    when {
        saldo > 0.0 -> println("saldo positivo")
        saldo == 0.0 -> println("saldo neutro")
        else -> println("saldo negativo")
    }
}

