fun main() {
    val d = 2
    val pi = 3.14

    println("直徑是${d}公分的圓")
    println("其圓周為${d * pi}公分")

    val num1 = 5
    val num2 = 4

    // 兩個整數先相除 (5 / 4 = 1)，再轉為 Double (1.0)
    val div1: Double = (num1 / num2).toDouble()

    // 將整數轉為 Double (5.0 / 4.0) 進行浮點數除法，結果為 1.25
    val div2 = num1.toDouble() / num2.toDouble()

    println("5/4等於$div1")
    println("5/4等於$div2")
}