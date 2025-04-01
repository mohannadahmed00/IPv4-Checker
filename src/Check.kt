/*
    After completing the instructional videos, implement an IPv4 address checker function that determines whether a given string is a valid IPv4 address.
    An IPv4 address is valid if it consists of four numeric segments, separated by dots (.), where:

    Each segment must be a number between 0 and 255, inclusive.
        - Leading zeros in any segment (e.g., "01" or "001") are not allowed, except for the digit "0" itself.
        - The address must contain exactly three dots and no extra characters.
        - The function should return a Boolean value only—true if the input is a valid IPv4 address, and false otherwise.

    You must follow a Test-Driven Development (TDD) approach while building this function:
        - Create a check function, follow the tutorial structure, and write comprehensive test cases first without implementing any logic in the checker function. Initially, the function should always return false.
        - Share your written test cases with your mentor during the daily meeting for review and feedback.
          Once approved, begin implementing the logic of the IPv4 checker function step by step, ensuring that each test passes.
*/

fun main() {
    check(
        name = "when enter IP consists of four numeric segments separated by dots (.), each number between 0 and 255, without leading zeros (e.g., 01 or 001) in any segment and contains exactly three dots and no extra characters return true",
        result = isIPv4Valid("192.168.1.1"),
        correctResult = true
    )
    check(
        name = "when enter IP consists of less than four numeric segments separated by dots (.) return false",
        result = isIPv4Valid("192.168.1"),
        correctResult = false
    )
    check(
        name = "when enter IP consists of more than four numeric segments separated by dots (.) return false",
        result = isIPv4Valid("192.168.1.1.5"),
        correctResult = false
    )
    check(
        name = "when enter IP contains a number out of range 0 and 255 return false",
        result = isIPv4Valid("302.168.1.1"),
        correctResult = false
    )
    check(
        name = "when enter IP contains numeric segments with leading zeros (e.g., 01 or 001) return false",
        result = isIPv4Valid("192.168.01.1"),
        correctResult = false
    )
    check(
        name = "when enter IP contains more than three dots return false",
        result = isIPv4Valid("192.168.1..1"),
        correctResult = false
    )
    check(
        name = "when enter IP contains less than three dots return false",
        result = isIPv4Valid("192.1681.1"),
        correctResult = false
    )
    check(
        name = "when enter IP contains any character return false",
        result = isIPv4Valid("192.1681.a.1"),
        correctResult = false
    )
}

fun check(
    name: String,
    result: Boolean,
    correctResult: Boolean,
) {
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name")
    }
}