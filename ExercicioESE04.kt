fun main() {
    print("Digite a nota do primeiro bimestre: ")
    val nt1 = readLine()!!.toDouble()
    print("Digite a nota do segundo bimestre: ")
    val nt2 = readLine()!!.toDouble()
    print("Digite a nota do terceiro bimestre: ")
    val nt3 = readLine()!!.toDouble()
    print("Digite a nota do quarto bimestre: ")
    val nt4 = readLine()!!.toDouble()
      
    println("A média foi ${(nt1 + nt2 + nt3 + nt4)/4}")
}