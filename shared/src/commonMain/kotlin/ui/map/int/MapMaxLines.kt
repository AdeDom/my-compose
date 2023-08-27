package ui.map.int

internal fun Int?.mapMaxLines(): Int {
    return this ?: Int.MAX_VALUE
}
