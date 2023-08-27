package ui.map.modifier

import androidx.compose.foundation.clickable
import androidx.compose.ui.Modifier
import data.models.sdui.ActionData
import data.models.sdui.ModifierData

internal fun Modifier.mapClickable(
    modifier: ModifierData.Clickable,
    onClick: (ActionData?) -> Unit
): Modifier {
    return this.clickable(
        enabled = modifier.enabled ?: true,
        onClick = { onClick(modifier.action) }
    )
}
