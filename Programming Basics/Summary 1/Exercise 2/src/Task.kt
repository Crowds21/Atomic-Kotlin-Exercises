// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var result:String=""
  for (i in s.indices step 2){
    result += s[i]
  }
  return result
//  for (ch in s){ // 不支持 Step
//    result += ch
//  }
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/