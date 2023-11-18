package com.example.exercicio_modulo_3

class Ex1 {
}

//Crie uma variável mutável do tipo inteiro: Inicialize com o valor inicial de 6.
// Altere o valor dela para 5.
// Imprima o valor

//Crie uma variável imutáveldo tipo inteiro: Inicialize com valor de 6
// Altere o valor para 7 e Imprima o valor. O que aconteceu?


fun main(){
    var valor : Int = 6
    valor--
    println(valor)


    val valor2 : Int = 6
    //valor2++
    println(valor2)
    // nao vai dar certo, pois a declaracao de val faz com que nao deixe alterar o seu valor inicial
    // solucao trocar para var
}