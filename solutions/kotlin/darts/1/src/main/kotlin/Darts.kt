import kotlin.math.*

object Darts {
    fun score(x: Number, y: Number): Int {
        val xD = x.toDouble()
        val yD = y.toDouble()
        val distance = sqrt(xD.pow(2.0) + yD.pow(2.0))
        return when{
            distance <= 1 -> 10
            distance <= 5 -> 5
            distance <= 10 -> 1
            else -> 0
        }
    }
}
