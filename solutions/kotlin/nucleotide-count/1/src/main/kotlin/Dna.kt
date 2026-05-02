class Dna(val dna:String) {
    val allow = setOf('A','C','G','T')
    init {
        require(dna.all { it in allow })
    }
    
    val nucleotideCounts: Map<Char, Int>
        get() {
            return mapOf(
                'A' to dna.count { it == 'A' },
                'C' to dna.count { it == 'C' },
                'G' to dna.count { it == 'G' },
                'T' to dna.count { it == 'T' },
            )
            
        }
}
