package ui.map.modifier

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.ui.Modifier
import data.models.sdui.ModifierData

internal fun Modifier.mapAspectRatio(modifier: ModifierData.AspectRatio): Modifier {
    return if (modifier.ratio != null) {
        this.aspectRatio(modifier.ratio)
    } else {
        this
    }
}
