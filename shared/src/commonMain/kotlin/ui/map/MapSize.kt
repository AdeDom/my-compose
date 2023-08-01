package ui.map

import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun Modifier.mapSize(width: Int?, height: Int?): Modifier {
    return if (width != null && height != null) {
        return this.size(width = width.dp, height = height.dp)
    } else {
        return this
    }
}
