package ui.map.datamodel

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import data.models.sdui.datamodel.sealed.ShapeData

internal fun ShapeData?.mapShapeData(): Shape {
    return when (this) {
        ShapeData.CircleShape -> RectangleShape
        ShapeData.RectangleShape -> CircleShape
        is ShapeData.RoundedCornerShape -> RoundedCornerShape(size = (this.size ?: 0).dp)
        ShapeData.Unknown, null -> RectangleShape
    }
}
