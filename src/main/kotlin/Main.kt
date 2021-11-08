import Pacote.Funcionario

fun main(args: Array<String>) {

    val isis = Representante("Isadora", "Oliver", 566229, 28, 360, 30, 3400.0, 1)
    val saulo = Representante("Thalita", "Gamma", 566298, 28, 360, 30, 3400.0, 1)

    val thalita = GerenteDeVendas("Thalita", "Silva", 56766, 30, 380, 40, 3400.0, 1)

    isis.vendasfeitas = 3000.0
    saulo.vendasfeitas = 4000.0

    val listafun = mutableListOf(isis, saulo)

    thalita.cadastrar(listafun)

    println(thalita.listaFuncionario.size)

    thalita.calculaComissao()

    thalita.mostraFun()


}
