package ui.map.modifier

import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.models.sdui.ModifierData

internal fun Modifier.mapHeight(modifier: ModifierData.Height): Modifier {
    return if (modifier.height != null) {
        this.height(modifier.height.dp)
    } else {
        this
    }
}
