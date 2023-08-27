package utils.extensions

import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.debugInspectorInfo
import compose.foundation.layout.LayoutWeightImpl

fun Modifier.weight(weight: Float, fill: Boolean = true): Modifier {
    require(weight > 0.0) { "invalid weight $weight; must be greater than zero" }
    return this.then(
        LayoutWeightImpl(
            weight = weight,
            fill = fill,
            inspectorInfo = debugInspectorInfo {
                name = "weight"
                value = weight
                properties["weight"] = weight
                properties["fill"] = fill
            }
        )
    )
}
