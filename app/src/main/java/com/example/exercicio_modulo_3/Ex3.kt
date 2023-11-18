package com.example.exercicio_modulo_3

class Ex3 {
}

fun main(){
    //Crie um array de inteiro de tamanho 40
    // Escreve um código que escreva os número de 1 a 39 neste array utilizando o comando for
    var array = IntArray(40)

    var i = 0
    for(k in 1..array.size -1){
        i++
        println(i)
    }

    // Crie uma lista de inteiros.
    // Escreva na lista os números de 1 a 99 utilizando o comando for

    var lista : MutableList<Int> = mutableListOf()

    for (i in 1..99){
       println(i)
       lista.add(i)
    }

// Utilizando a lista anterior, crie uma variável do tipo inteiro de nome soma e inicialize ela com o valor 0
// Crie um código que percorre a lista que criamos anteriormente e que a cada interação,acrescente o valor da posição atual a variável soma

    var soma = 0

    for(j in lista){
        soma += j
    }

    println("A soma dos números de 1 a 99 é: $soma")

}