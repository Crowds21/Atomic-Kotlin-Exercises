// NamedAndDefaultArgs/Task1.kt
package namedAndDefaultArgumentsExercise1

class Rectangle(
  var side1:Double = 1.0,
  var side2:Double = 2.0,
  var color:String="yellow"
){
  override fun toString(): String {
    return "$color rectangle $side1 x $side2"
  }
}

fun main() {
  println(Rectangle())

  // TODO
}