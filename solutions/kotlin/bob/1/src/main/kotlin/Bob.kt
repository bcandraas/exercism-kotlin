object Bob {
    fun hey(input: String): String {
        val trimmed = input.trim()
        val isAllCaps = trimmed.any { it.isLetter() } && trimmed == trimmed.uppercase()
        val isQuestion = trimmed.endsWith("?")
        if (isAllCaps && isQuestion) {
            return "Calm down, I know what I'm doing!"
        } else if (isAllCaps) {
            return "Whoa, chill out!"
        } else if (isQuestion) {
            return "Sure."
        } else if (input.isBlank()){
            return "Fine. Be that way!"
        } else {
            return "Whatever."
        }
    }
}
