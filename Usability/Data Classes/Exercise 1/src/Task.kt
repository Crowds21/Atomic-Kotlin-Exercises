// DataClasses/Task1.kt
package dataClassesExercise1

import atomictest.eq

// Implement AirlineTicket class
data class AirlineTicket(
    val firstName:String,
    val lastName:String,
    val ticket:Int,
    val origin:String,
    val destination:String
)
fun main() {
/*
  val ticket = AirlineTicket("Bruce", "Eckel",
    123456, "DEN", "HND")
  println(ticket)
*/
    val test = AirlineTicket("1","2",3,"4","5")
    test.firstName eq "1"

}
/* Expected output:
AirlineTicket(firstName=Bruce, lastName=Eckel, ticket=123456, origin=DEN, destination=HND)
*/