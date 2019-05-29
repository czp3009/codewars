//https://www.codewars.com/kata/550498447451fbbd7600041c/train/kotlin
fun comp(a: IntArray?, b: IntArray?): Boolean {
    return if (a == null || b == null || a.size != b.size) {
        false
    } else {
        a.sort()
        b.sort()
        a.asSequence().zip(b.asSequence()).all { (a, b) ->
            a * a == b
        }
    }
}
