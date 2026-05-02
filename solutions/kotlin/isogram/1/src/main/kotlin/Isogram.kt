object Isogram {
    fun isIsogram(input: String): Boolean {
        val lower = input.lowercase().filter{ it.isLetter()}
        return lower.length == lower.toSet().size
    }
}