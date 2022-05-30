// Varargs/ListOf.kt
import atomictest.eq

fun main() {
    var refactorTest = 1
    refactorTest += 1
    listOf(1) eq "[1]"
    listOf("a", "b") eq "[a, b]"
}