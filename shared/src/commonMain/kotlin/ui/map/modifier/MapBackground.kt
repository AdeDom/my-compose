package ui.map.modifier

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import data.models.sdui.ModifierData
import data.models.sdui.datamodel.sealed.BackgroundData
import ui.map.datamodel.mapBrushData
import ui.map.datamodel.mapShapeData
import ui.map.string.mapColor

internal fun Modifier.mapBackground(modifier: ModifierData.Background): Modifier {
    return when (modifier.background) {
        is BackgroundData.Brush -> this.background(
            brush = modifier.background.brush.mapBrushData(),
            shape = modifier.background.shape.mapShapeData(),
            alpha = modifier.background.alpha ?: 1f
        )

        is BackgroundData.Color -> this.background(
            color = modifier.background.color.mapColor(),
            shape = modifier.background.shape.mapShapeData()
        )

        BackgroundData.Unknown, null -> this
    }
}
