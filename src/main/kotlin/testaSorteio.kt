fun sorteioBonificacao() {

    println()
    val sorteio = SorteioBonificacao(
        nome = "Lucas",
        numeroEscolhido = 5,
    )

    println("nome: ${sorteio.nome}")
    println("numero Escolhido: ${sorteio.numeroEscolhido}")

    sorteio.aposta(1, 20)
}