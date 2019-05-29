//https://www.codewars.com/kata/highest-and-lowest/train/kotlin
fun highAndLow(numbers: String): String {
    return numbers.split(' ')
        .map { it.toInt() }
        .let { "${it.max()} ${it.min()}" }
}
