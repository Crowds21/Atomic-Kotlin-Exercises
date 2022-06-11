// NullableExtensions/Task3.kt
package extensionsForNullableTypesExercise3
import atomictest.eq

data class Container(val contents: Any?)

fun Container?.empty() = this == null || contents == null
// Container 对象为空,或者 Container.contents 为空
fun Container?.full() = !empty()

fun main() {
    val container = Container(42)
    container.empty() eq false
    container.full() eq true

    val emptyContainer = Container(null)
    emptyContainer.empty() eq true
    emptyContainer.full() eq false
}