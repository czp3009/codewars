//https://www.codewars.com/kata/vowel-count/train/kotlin
fun getCount(str: String): Int {
    val vowel = charArrayOf('a', 'e', 'i', 'o', 'u')
    return str.count { it in vowel }
}
