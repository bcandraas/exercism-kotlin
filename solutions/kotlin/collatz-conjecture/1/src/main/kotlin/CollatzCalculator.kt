object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start > 0)
        var i = start
        var steps = 0
        while (i != 1) {
            i = when {
                i % 2 == 0 -> i / 2
                else -> i * 3 + 1
            }
            steps++
        }
        return steps
    }
}