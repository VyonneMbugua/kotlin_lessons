fun main(args: Array<String>) {
    // Marks out of 100
    val marks = 90
    if (marks < 30) {
        println("Father will get angry")
    }
    else {
        println("Father will give me money")
    }
}
fun main(args: Array<String>) {
    val num = 99
    if(num<0)
        println("Number is Negative")
    else if (num>0 && num<10)
        println("Single digit number")
    else if (num>=10 && num <100)
        println("Double digit number")
    else
        println("Number has 3 or more digits")
}
fun main(args: Array<String>) {
    val num = 101
    if(num<0)
        println("Negative Number")
    else {
        //Nested expression
        if(num%2 == 0)
            println("Even Number")
        else
            println("Odd Number")
    }
