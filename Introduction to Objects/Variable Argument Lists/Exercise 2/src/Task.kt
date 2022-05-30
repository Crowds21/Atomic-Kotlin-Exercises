// Varargs/Task2.kt
package variableArgumentListsExercise2

fun printArgs(string: String,vararg numbers:Int) {
    println("$string${numbers.toList()}")
}

fun main() {
    printArgs("Numbers: ", 1, 2, 3)
}
/* Expected output:
Numbers: [1, 2, 3]
 */