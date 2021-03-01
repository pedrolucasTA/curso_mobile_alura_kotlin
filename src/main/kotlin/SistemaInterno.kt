class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println(">>> Acesso concedido ao BlackBank <<<")
        }else{
            println(">>> Acesso não concedido ao BlackBank <<<")
        }
    }

}