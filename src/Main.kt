fun main() {}

fun isIPv4Valid(input: String): Boolean {
    val segments = input.split(".")
    if (segments.size != 4) return false
    if (hasAnyCharacter(input)) return false
    if (hasOuOfRangeNumber(segments)) return false
    if (hasLeadingZerosSegment(segments)) return false
    return true
}

fun hasOuOfRangeNumber(segments: List<String>): Boolean {
    segments.forEach { number ->
        if (number.toInt() < 0 || number.toInt() > 255) return true
    }
    return false
}

fun hasLeadingZerosSegment(segments: List<String>): Boolean {
    segments.forEach { number ->
        if (number.length > 1 && number[0] == '0') return true
    }
    return false
}

fun hasAnyCharacter(segments: String): Boolean {
    segments.replace(".", "").forEach { char ->
        if (!char.isDigit()) return true
    }
    return false
}