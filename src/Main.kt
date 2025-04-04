fun isIPv4Valid(input: String): Boolean {
    val segments = input.split(".")
    if (segments.size != 4) return false
    return segments.all { segment ->
        isNumeric(segment) && !hasOutOfRangeNumber(segment) && !hasLeadingZerosSegment(segment)
    }
}

fun hasOutOfRangeNumber(segment: String) = segment.toInt() !in 1..255

fun hasLeadingZerosSegment(segment: String) = segment[0] == '0'

fun isNumeric(segment: String) = segment.toIntOrNull() != null