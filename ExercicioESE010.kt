fun main() {
    print("Digite o valor em Celsius a ser convertido: ")
    val cel = readLine()!!.toDouble()
    println("$cel Celsius = ${1.8 * cel + 32} Fahrenheit.")
}