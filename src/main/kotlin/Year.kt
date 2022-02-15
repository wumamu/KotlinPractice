//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//}

fun main(){
    println(isLeapYear(2004))
}
fun isLeapYear(year: Int) : Boolean {
    return when {
        year%400==0 -> true
        year%100==0 -> false
        year%4==0 -> true
        else -> false
    }
}
