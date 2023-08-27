package ui.map.datamodel

import androidx.compose.ui.Modifier
import data.models.sdui.ModifierData
import utils.extensions.weight

internal fun Modifier.mapWeight(modifier: ModifierData.Weight): Modifier {
    return if (modifier.weight != null) {
        this.weight(modifier.weight, modifier.fill ?: true)
    } else {
        this
    }
}
