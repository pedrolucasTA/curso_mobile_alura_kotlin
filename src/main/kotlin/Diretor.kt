class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    var plr: Double
): FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
){

    override val bonificacao: Double
        get(){
            return + salario + plr
    }

}