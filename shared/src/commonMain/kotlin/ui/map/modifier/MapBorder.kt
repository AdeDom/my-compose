package ui.map.modifier

import androidx.compose.foundation.border
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.models.sdui.ModifierData
import data.models.sdui.datamodel.sealed.BorderData
import ui.map.datamodel.mapBrushData
import ui.map.datamodel.mapShapeData
import ui.map.string.mapColor

internal fun Modifier.mapBorder(modifier: ModifierData.Border): Modifier {
    return when (modifier.border) {
        is BorderData.Brush -> this.border(
            width = (modifier.border.width ?: 1).dp,
            brush = modifier.border.brush.mapBrushData(),
            shape = modifier.border.shape.mapShapeData()
        )

        is BorderData.Color -> this.border(
            width = (modifier.border.width ?: 1).dp,
            color = modifier.border.color.mapColor(),
            shape = modifier.border.shape.mapShapeData()
        )

        BorderData.Unknown, null -> this
    }
}
