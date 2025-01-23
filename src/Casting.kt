fun main() {
    var pi = 3.14
    val test = pi.toString()
    print(test)
    var num1:Int? = null

    num1!!.toDouble() // force convert even if its null
    num1?.toDouble() // if there is a null in this var  it doesn't cast the var and continue the code

}