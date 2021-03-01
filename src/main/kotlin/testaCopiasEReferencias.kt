fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println(numeroX)
    println(numeroY)

    val contaJoao = ContaCorrente("João", 1002)
    contaJoao.titular = "João"
    var contaMaria = ContaPoucanca("Maria", 1003)
    contaMaria.titular = "Maria"

    println("conta joão: ${contaJoao.titular} ")
    println("conta maria: ${contaMaria.titular} ")

    println(contaJoao)
    println(contaMaria)
}

