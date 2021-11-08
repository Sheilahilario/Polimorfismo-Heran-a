import Pacote.Funcionario

class Representante(nome: String, sobrenome: String, registro: Int,
                    idade: Int, diastrab: Int, diasferias: Int, salario: Double,
                    anostrab: Int, var vendasfeitas: Double = 0.0)
    : Funcionario(nome, sobrenome, registro, idade,
    diastrab, diasferias, salario, anostrab){

    fun calculaComissao(){
        var comissao = 0.1 * vendasfeitas
        println("O total de cada funcionário é $vendasfeitas")
    }
}