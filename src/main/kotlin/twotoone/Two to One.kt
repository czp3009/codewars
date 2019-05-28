package twotoone

fun longest(s1: String, s2: String): String {
    val exists = BooleanArray(26)
    s1.forEach { exists[it - 'a'] = true }
    s2.forEach { exists[it - 'a'] = true }
    return StringBuilder(26).apply {
        exists.forEachIndexed { index, it -> if (it) append('a' + index) }
    }.toString()
}
