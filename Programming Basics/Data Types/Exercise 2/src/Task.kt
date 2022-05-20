// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  val c1:Double = int + double
  val c2:String = string + character
  val c3:Char= character + int
  val c4 :Double= double + int
  val c5 :String= string + boolean
  val c6 :String= string + int
  val c7 :String= string + double
  val c8 :String= string + character
  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:

}