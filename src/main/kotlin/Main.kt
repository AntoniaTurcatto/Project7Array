import java.util.Random
import java.util.Scanner

fun main() {
    //1 - Escreva um programa que crie um array de 10 números
    // inteiros aleatórios e
    //imprima o maior número do array.
    val random = Random()

    var numbers = IntArray(10)
    var maiorNumero= 0

    for(i in 0..9){
        numbers[i]=random.nextInt()
        if (numbers[i]>maiorNumero){
            maiorNumero=numbers[i]
        }
    }
    println("Maior número: $maiorNumero")

    //2 - Escreva um programa que crie um array de 10 números inteiros digitados pelo
    //usuário e imprima a média dos números do array.
    val teclado = Scanner(System.`in`)

    var numbersUser= IntArray(10)
    var totalNumbers:Int = 0
    for(i in 0..9){
        println("Informe um número inteiro: ")
        numbersUser[i]=teclado.nextInt()
        totalNumbers+=numbersUser[i]
    }
    println("Média dos número informados: ${totalNumbers.toFloat()/numbersUser.size}")

    //3 - Escreva um programa que crie um array de 10 strings com nomes de frutas e
    //imprima somente as frutas que começam com a letra "a" usando loop for e if.

    var arrayStrings = arrayOf("Banana", "Abacaxi", "Laranja", "Abacate", "Amêndoa", "Ameixa", "Bergamota", "Melancia", "Uva", "Araçá")

    println("Frutas do array que começam com a letra 'A': ")
    for (i in 0..9){
        if (arrayStrings[i][0]=='A'){
            println(arrayStrings[i])
        }
    }
}