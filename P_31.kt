fun main() {
    // 可以在字串中直接透過 ${} 進行運算
    println("1+2等於${1 + 2}")
    println("3*4等於${3 * 4}")

    var num1 = 2  // 後續會變動，使用 var
    val num2 = 3  // 不會變動，使用 val
    val sum = num1 + num2

    println("變數num1的值是$num1")
    println("變數num2的值是$num2")
    println("num1+num2的值是$sum")

    num1 = num1 + 1 // 也可以寫成 num1++ 或 num1 += 1

    println("變數num1的值加1之後是$num1")
}