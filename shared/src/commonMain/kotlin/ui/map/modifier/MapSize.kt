package ui.map.modifier

import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.models.sdui.ModifierData

internal fun Modifier.mapSize(modifier: ModifierData.Size): Modifier {
    return when {
        modifier.size != null -> {
            this.size(size = modifier.size.dp)
        }

        modifier.width != null &&
            modifier.height != null -> {
            this.size(
                width = modifier.width.dp,
                height = modifier.height.dp
            )
        }

        else -> {
            this
        }
    }
}
