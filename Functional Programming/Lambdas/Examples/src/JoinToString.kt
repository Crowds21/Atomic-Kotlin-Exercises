// Lambdas/JoinToString.kt
import atomictest.eq

fun main() {
  val list = listOf(9, 11, 23, 32)
  // 这里 kotlin 直接推断出参数名称为 `it`
  //  Kotlin infers the type of the lambda argument name is  `it`
  list.joinToString(" ") { "[$it]" } eq
    "[9] [11] [23] [32]"
}