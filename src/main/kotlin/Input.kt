
fun main(){
    fun readInt() = readLine()!!.toInt()
    fun readString() = readLine()!!.split(" ")
    fun readInts() = readString().map { it.toInt() }

    val n = readInt()
    for(i in 1..n){
        val (a, b) = readInts()
        println(a+b)
    }
//    val testcaseNum = readLine()?.toInt()
//    var i = 0
//    if(testcaseNum!=null){
//        while (i++<testcaseNum){
////            val(a, b) = readLine()!!.split(' ')
//            val(a, b) = readLine()!!.split(' ')
//            println(a.toInt()+ b.toInt())
//        }
//    }
}