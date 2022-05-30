// Lists/Task1.kt
package listsExercise1
import atomictest.eq

fun findMax(list: IntList): Int {
  var max = 0;
  var err = true;
  for (i in list){
    if (i>=max) {
      max = i
      err = false
    }
  }
//  if (err) throw Exception("all items are smaller than 0")
  return max
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  findMax(list) eq 3
}