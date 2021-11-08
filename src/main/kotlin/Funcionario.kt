package Pacote

import kotlin.math.E
import kotlin.math.min

abstract class Funcionario(var nome: String, var sobrenome: String,
                    var registro: Int, var idade: Int,
                    var diastrab: Int, var diasferias: Int,
                    var salario: Double, var anostrab: Int) {

    fun aposentadoria(): Int {
        var idademin = 60
        return (idademin - anostrab)
    }

    fun feriasrest() {
        var feriasrest = (diastrab/360)*(30 - diasferias)
        println("ainda tem $feriasrest de ferias")
    }

    fun calculateBonus() {
        var bonus = 2.2*salario
    }
}