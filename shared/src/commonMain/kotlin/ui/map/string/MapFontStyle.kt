package ui.map.string

import androidx.compose.ui.text.font.FontStyle
import data.models.sdui.datamodel.enumclass.FontStyleData

internal fun String?.mapFontStyle(): FontStyle? {
    return when (this) {
        FontStyleData.Normal.name -> FontStyle.Normal
        FontStyleData.Italic.name -> FontStyle.Italic
        else -> null
    }
}
