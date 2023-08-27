package ui.map.int

import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

internal fun Int?.mapFontSize(): TextUnit {
    return this?.sp ?: TextUnit.Unspecified
}
