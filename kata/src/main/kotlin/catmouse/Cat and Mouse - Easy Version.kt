//https://www.codewars.com/kata/cat-and-mouse-easy-version/train/kotlin
package catmouse

fun catMouse(s: String): String {
    return if (s.length > 5) "Escaped!" else "Caught!"
}
