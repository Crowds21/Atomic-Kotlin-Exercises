// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var string:String = "";
  for (i in ('a'..'z') ){
    string +=i
  }
  return  string
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}