import kotlin.math.pow

fun main() {
    print("Digite o lado do quadrado: ")
    val lado = readLine()!!.toDouble()
    println("O dobro da área do quadrado é ${lado.pow(2.0)*2}")
}