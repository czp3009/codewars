//https://www.codewars.com/kata/meeting/train/kotlin
fun meeting(s: String): String {
    return s.toUpperCase().split(';').map {
        it.split(':')
    }.map {
        "(${it.last()}, ${it.first()})"
    }.sorted().joinToString(separator = "")
}
