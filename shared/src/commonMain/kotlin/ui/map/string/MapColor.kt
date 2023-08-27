package ui.map.string

import androidx.compose.ui.graphics.Color
import utils.extensions.toColor

internal fun String?.mapColor(): Color {
    return this?.toColor() ?: Color.Unspecified
}
