package ui.map.string

import androidx.compose.ui.Alignment
import data.models.sdui.datamodel.enumclass.AlignmentData

internal fun String?.mapVerticalAlignment(): Alignment.Vertical {
    return when (this) {
        AlignmentData.Top.name -> Alignment.Top
        AlignmentData.CenterVertically.name -> Alignment.CenterVertically
        AlignmentData.Bottom.name -> Alignment.Bottom
        else -> Alignment.Top
    }
}
