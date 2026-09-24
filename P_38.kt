fun main() {
    val dnum = 160.5

    println("身高是${dnum}公分")

    println("指定給int型態的變數")

    // Kotlin 不支援 C 語言風格的 (int)dnum 轉型，必須使用 .toInt() 方法
    val inum = dnum.toInt()

    println("身高是${inum}公分")
}