// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(string:String) {
    var i =0;
   while (string.length>i){
       println(string[i])
       i++
   }
}

fun main() {
  displayContent("abc")
}
/* Expected output:
a
b
c
*/