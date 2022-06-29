class `hesabu` {
    //data member
    var num1:Int=67
    var num2:Int=98

    //MEMBER FUNCTION

    fun arithmetic():Int{
        return num2*num1
    }

}

fun main(args: Array<String>) {
    //creating object
    val myobj=hesabu()
    println(myobj.arithmetic())
}