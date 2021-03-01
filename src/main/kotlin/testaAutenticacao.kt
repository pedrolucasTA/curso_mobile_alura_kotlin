fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Arnaldo",
        cpf = "555.555.555-55",
        2000.00,
        1234
    )
    val diretor = Diretor(
        nome = "Agnaldo",
        cpf = "666.666.666-66",
        3000.00,
        4321,
        plr = 200.00
    )

    val cliente = Cliente(
        nome = "Rosa",
        cpf = "777.777.777-77",
        senha = 5555
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 4321)
    sistema.entra(cliente, 5555)

}