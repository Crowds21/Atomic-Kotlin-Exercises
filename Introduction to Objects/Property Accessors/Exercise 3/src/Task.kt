// PropertyAccessors/Task3.kt
package propertyAccessorsExercise3
import atomictest.eq

// TODO: create class MessageStorage
class MessageStorage{
    private  var _messages:MutableList<String> = mutableListOf()
    val messages:List<String>
        get()= _messages;
    fun addMessage(param:String){
        _messages += param
    }
}

fun main() {
/*
  val messageStorage = MessageStorage()
  messageStorage.addMessage("first")
  messageStorage.addMessage("second")
  messageStorage.messages eq listOf("first", "second")
  // doesn't compile:
//  messageStorage.messages.remove("first")
*/
}