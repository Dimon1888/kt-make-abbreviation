package mate.academy
//Багато речей у світі складаються з кількох слів.
// Ми хочемо створити makeAbbr()метод,
// який повертає їхні скорочення.

fun makeAbbr(source: String) : String {
    // implement this function
    return source
        .split(' ')
        .filter { it.isNotEmpty()}
        .map {it.first().toString()}
        .joinToString ("")
        .uppercase()
}
fun main() {
    println(makeAbbr("nayional aeronautics space adminisration"))
    println(makeAbbr("central processing unit"))
    println(makeAbbr("simlified molecular input line entry specification"))
}