fun main() {
    print("Digite o valor em Fahrenheit a ser convertido: ")
    val fah = readLine()!!.toDouble()
    println("$fah Fahrenheit = ${(5 * (fah-32) / 9)} Celsius.")
}