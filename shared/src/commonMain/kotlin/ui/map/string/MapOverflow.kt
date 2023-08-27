package ui.map.string

import androidx.compose.ui.text.style.TextOverflow
import data.models.sdui.datamodel.enumclass.TextOverflowData

internal fun String?.mapOverflow(): TextOverflow {
    return when (this) {
        TextOverflowData.Clip.name -> TextOverflow.Clip
        TextOverflowData.Ellipsis.name -> TextOverflow.Ellipsis
        TextOverflowData.Visible.name -> TextOverflow.Visible
        else -> TextOverflow.Clip
    }
}
