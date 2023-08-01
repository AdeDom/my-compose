package ui.map

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import view.extensions.appColor

fun Modifier.mapColor(hexColor: String?): Modifier {
    return if (hexColor != null) {
        this.background(Color(hexColor.appColor()))
    } else {
        this
    }
}
