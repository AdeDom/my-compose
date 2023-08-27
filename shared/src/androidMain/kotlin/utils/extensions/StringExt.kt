package utils.extensions

import androidx.compose.ui.graphics.Color

actual fun String?.toColor(): Color {
    return if (this.isColor()) {
        Color(android.graphics.Color.parseColor(this))
    } else {
        Color.Unspecified
    }
}
