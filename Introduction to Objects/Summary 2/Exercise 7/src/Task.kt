// Summary2/Task7.kt
package summaryIIExercise7
import atomictest.eq

val intToRomanNumeralMap: Map<Int, String> = mapOf(
  1000 to "M",
  900 to "CM",
  500 to "D",
  400 to "CD",
  100 to "C",
  90 to "XC",
  50 to "L",
  40 to "XL",
  10 to "X",
  9 to "IX",
  5 to "V",
  4 to "IV",
  1 to "I")

/**
 * 对 intToRomanNumeralMap 中的数字,从大到小,依次整除,结果就是这个字符需要重复的次数
 * 每次循环后,对对这个数字进行取余,以进行下一次循环
 *
 */
fun convertToRoman(number: Int): String {
  var result = ""
  var remainder = number
  for ((int, roman) in intToRomanNumeralMap) {
    val times = remainder / int
    result += roman.repeat(times)
    remainder %= int
  }
  return result
}

fun main() {
  convertToRoman(23) eq "XXIII"
  convertToRoman(44) eq "XLIV"
  convertToRoman(100) eq "C"
  convertToRoman(2018) eq "MMXVIII"
}