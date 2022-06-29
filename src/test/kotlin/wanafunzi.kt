class wanafunzi( val name:String, val Gender:String,var PhoneNumber:Int ,var courseTaken:String) {
}

fun main(args: Array<String>) {
    val obj=wanafunzi(name="Vyonne", Gender="Female", PhoneNumber=708733053, courseTaken = "Architecture")
    println("The student name is ${obj.name}, of the ${obj.Gender}, and the mobile number is ${obj.PhoneNumber}, and they took ${obj.courseTaken}course")

}