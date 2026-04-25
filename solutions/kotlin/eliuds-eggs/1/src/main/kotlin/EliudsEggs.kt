object EliudsEggs {
    fun eggCount(number: Int): Int{
        val binaryString = number.toString(2)
        val totalEggs = binaryString.count { it == '1' } 
        return totalEggs
    }
}
