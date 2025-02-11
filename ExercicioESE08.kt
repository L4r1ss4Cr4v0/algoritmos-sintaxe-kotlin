fun main() {
    print("Quanto você ganha por hora? : ")
    val valor = readLine()!!.toDouble()
    print("Quantas horas você trabalha? : ")
    val hora = readLine()!!.toDouble()
    println("Seu salário é ${valor*hora}")
}