import kotlin.math.pow

const val PI: Double = 3.141592653589793

fun main() {
    print("Digite o raio do círculo: ")
    val raio = readLine()!!.toDouble()
    println("A área do circulo é ${PI * raio.pow(2.0)}")
}