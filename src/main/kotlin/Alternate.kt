fun main(){
    println(isAlt("banana"))
}

fun isAlt(word: String): Boolean{
    var mark = false
    val vowel = listOf('a', 'e', 'i', 'o', 'u')
    if(word[0] in vowel){
        mark = true
    }
    for (i in 1 until  word.length){
        if(mark && word[i] in vowel){
            return false
        } else if (!mark && word[i] !in vowel){
            return false
        }
        mark = !mark
    }
    return true
}