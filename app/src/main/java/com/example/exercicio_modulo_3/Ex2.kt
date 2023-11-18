package com.example.exercicio_modulo_3

class Ex2 {
}
//Crie um condicional que testa se uma variável é par, se for ela, imprimir na tela "O número é par" senão deve imprimir "O número é impar"
// Teste primeiro utilizando a variável par e verifique o resultado
// Faço o mesmo teste agora usando a variável impar
// Refaça o exemplo anterior utilizando o comando when para testar o valor da variável

fun main(){
    var valor = 3

    if(valor % 2 == 0){
        println("O número é par")
    } else{
        println("O número é impar")
    }

    when{
        valor % 2 == 0 -> println("O número é par")
        else -> println("O número é impar")
    }


}