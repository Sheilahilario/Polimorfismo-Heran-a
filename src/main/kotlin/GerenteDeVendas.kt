import Pacote.Funcionario

class GerenteDeVendas(nome: String, sobrenome: String,
                      registro: Int, idade: Int, diastrab: Int,
                      diasferias: Int, salario: Double, anostrab: Int)
    : Funcionario(nome, sobrenome, registro, idade, diastrab,
    diasferias, salario, anostrab) {

    var listaFuncionario = HashMap<Int,Representante>()

    fun cadastrar(representante: Representante){
        listaFuncionario.put(representante.registro,representante)
    }

    fun cadastrar(representantes: List<Representante>){
        for (i in representantes){
            listaFuncionario.put(i.registro,i)
        }
    }

    fun calculaComissao() {
        var totalVendas = 0.0
        var totalComissao = 0.0
        for (i in listaFuncionario){
            totalVendas += i.value.vendasfeitas
        }
        totalComissao = 0.03 * totalVendas
        println("A comissão do gerente é $totalComissao")
    }

    fun mostraFun(){
        for (i in listaFuncionario){
            println(i.value.nome)
        }
    }

}
