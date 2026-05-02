import java.math.BigInteger

object Board {

    fun getGrainCountForSquare(number: Int): BigInteger {
        require(number > 0 && number < 65)
        val grain = BigInteger.TWO.pow(number-1)
        return grain
    }

    fun getTotalGrainCount(): BigInteger {
        var total = BigInteger.ZERO
        for (i in 1..64) {
            total += getGrainCountForSquare(i)
        }
        return total
    }
}
