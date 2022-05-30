// ExtensionFunctions/Task1.kt
package extensionFunctionsExercise1
import atomictest.eq

/**
 * 可以通过 this 来访问当前的类对象
 */
fun String.wrapInTag(tagName: String): String = "<$tagName>$this</$tagName>"

fun main() {
  "cat".wrapInTag("animal") eq "<animal>cat</animal>"
}