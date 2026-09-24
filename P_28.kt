fun main() {
    println("請輸入一個整數")

    // Kotlin 內建 readln()，不需要建立 BufferedReader
    val str1 = readln()
    val num = str1.toInt()

    println("您輸入的數字是:$num")

    println("請輸入字串")

    val str2 = readln()

    println("剛剛輸入的字串是:$str2")
}