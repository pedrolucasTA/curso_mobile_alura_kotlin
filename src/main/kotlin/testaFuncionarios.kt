fun testaFuncionarios() {
    val pedro = Analista(
        nome = "Pedro",
        cpf = "333.333.333-33",
        salario = 1000.00
    )

    println("nome: ${pedro.nome}")
    println("cpf: ${pedro.cpf}")
    println("salario: ${pedro.salario}")
    println("bonificação: ${pedro.bonificacao}")
    println()

    val lucas = Gerente(
        nome = "Lucas",
        cpf = "222.222.222-22",
        salario = 2000.00,
        senha = 1234
    )

    println("nome: ${lucas.nome}")
    println("cpf: ${lucas.cpf}")
    println("salario: ${lucas.salario}")
    println("bonificação: ${lucas.bonificacao}")

    if (lucas.autentica(1234)) {
        println(" >>> Acesso concedido <<< ")
    } else {
        println(" >>> Acesso negado <<< ")
    }

    println()
    val trentin = Diretor(
        nome = "Trentin",
        cpf = "111.111.111-11",
        salario = 3000.00,
        senha = 4321,
        plr = 200.00
    )

    println("nome: ${trentin.nome}")
    println("cpf: ${trentin.cpf}")
    println("salario: ${trentin.salario}")
    println("bonificação: ${trentin.bonificacao}")
    println("plr ${trentin.plr}")

    if (trentin.autentica(4321)) {
        println(" >>> Acesso concedido <<< ")
    } else {
        println(" >>> Acesso negado <<< ")
    }

    println()
    val agostini = Analista(
        nome = "Agostini",
        cpf = "444.444.444-44",
        salario = 4000.00
    )

    println("nome: ${agostini.nome}")
    println("cpf: ${agostini.cpf}")
    println("salario: ${agostini.salario}")
    println("bonificação: ${agostini.bonificacao}")

    println()
    val calculadora = CalculadoraBonificacao()
    calculadora.registra(pedro)
    calculadora.registra(lucas)
    calculadora.registra(trentin)
    calculadora.registra(agostini)

    println("total de bonificacao: ${calculadora.total}")
}