//https://www.codewars.com/kata/two-to-one/train/kotlin
package twotoone

fun longest(s1: String, s2: String): String {
    return (s1 + s2).toSortedSet().joinToString(separator = "")
}
