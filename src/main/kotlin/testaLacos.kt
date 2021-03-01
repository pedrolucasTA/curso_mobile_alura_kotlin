fun testaLacos() {

    var i = 1
    while (i < 5) {
        println(i)
    }

    for (i in 6 downTo 1 step 2) {
        println(i)

        val titular: String = "Pedro $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo $saldo")

        println()
    }

}

