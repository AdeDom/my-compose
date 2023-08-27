package ui.map.string

import androidx.compose.ui.Alignment
import data.models.sdui.datamodel.enumclass.AlignmentData

internal fun String?.mapHorizontalAlignment(): Alignment.Horizontal {
    return when (this) {
        AlignmentData.Start.name -> Alignment.Start
        AlignmentData.CenterHorizontally.name -> Alignment.CenterHorizontally
        AlignmentData.End.name -> Alignment.End
        else -> Alignment.Start
    }
}
