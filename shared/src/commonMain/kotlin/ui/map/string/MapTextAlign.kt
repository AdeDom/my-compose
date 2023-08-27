package ui.map.string

import androidx.compose.ui.text.style.TextAlign
import data.models.sdui.datamodel.enumclass.TextAlignData

internal fun String?.mapTextAlign(): TextAlign? {
    return when (this) {
        TextAlignData.Left.name -> TextAlign.Left
        TextAlignData.Right.name -> TextAlign.Right
        TextAlignData.Center.name -> TextAlign.Center
        TextAlignData.Justify.name -> TextAlign.Justify
        TextAlignData.Start.name -> TextAlign.Start
        TextAlignData.End.name -> TextAlign.End
        else -> null
    }
}
