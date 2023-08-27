package ui.map.string

import androidx.compose.ui.layout.ContentScale
import data.models.sdui.datamodel.enumclass.ContentScaleData

internal fun String?.mapContentScale(): ContentScale {
    return when (this) {
        ContentScaleData.Crop.name -> ContentScale.Crop
        ContentScaleData.FillBounds.name -> ContentScale.FillBounds
        else -> ContentScale.Fit
    }
}
