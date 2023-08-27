package ui.map.modifier

import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.models.sdui.ModifierData

internal fun Modifier.mapWidth(modifier: ModifierData.Width): Modifier {
    return if (modifier.width != null) {
        this.width(modifier.width.dp)
    } else {
        this
    }
}
