// IfExpressions/Task2.kt
package ifExpressionsExercise2

fun abs(number: Int): Int {
  return when {
    number >= 0 -> number
    else -> number * -1
  }
}

fun main() {
  println(abs(-19))  // 19
}