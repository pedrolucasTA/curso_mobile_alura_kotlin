import kotlin.random.Random

class SorteioBonificacao(
    val nome: String,
    var numeroEscolhido: Int
) {

    fun aposta(from: Int = 1, to: Int = 1) {
        var x = Random.nextInt(to - from)
        println("numero Sorteado: $x")

        return if (x == numeroEscolhido ){
            println("Parabéns seu número foi sorteado")
        } else {
            println("Infelizmente seu número não foi sorteado")
        }
    }
}