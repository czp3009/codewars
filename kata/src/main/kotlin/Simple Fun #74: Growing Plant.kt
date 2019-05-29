import kotlin.math.ceil

//https://www.codewars.com/kata/simple-fun-number-74-growing-plant/train/kotlin
fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {
    return if (desiredHeight <= upSpeed) {
        1
    } else {
        val dailySpeed = upSpeed - downSpeed
        ((desiredHeight - upSpeed) / dailySpeed.toDouble() + 1).ceilToInt()
    }
}

private fun Double.ceilToInt() = ceil(this).toInt()
