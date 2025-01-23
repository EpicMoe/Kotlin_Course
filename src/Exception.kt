fun main() {
    var num1: Int = 25
    var num2: Int? = null
    try {
        num2!!.toByte()
    } catch (e: Exception) {
        println(e.message)
        println("we have a exception!")
    } finally {
        print("app still running")
    }
}