// Constructors/Task1.kt
package constructorsExercise1

class Floating(
  val d: Double ){
  override fun toString(): String = d.toString()
}

fun main() {
  var i = Floating(12.1)
}