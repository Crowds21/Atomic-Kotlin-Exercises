// Summary1/Task3.kt
package summaryIExercise3

fun first(a: Boolean, b: Boolean, c: Boolean): Boolean =
  if (!a) false
  else if(!b) false
  else c

fun second(a: Boolean, b: Boolean, c: Boolean): Boolean =
  if (a) true
  else if (b) true
  else c

fun main() {
  println(first(true, true, true))
  println(first(true, false, true))

  println(second(false, false, false))
  println(second(false, true, false))
}
/* Output:
true
false
false
true
*/