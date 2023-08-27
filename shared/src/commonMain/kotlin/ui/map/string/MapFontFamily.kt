package ui.map.string

import androidx.compose.ui.text.font.FontFamily
import data.models.sdui.datamodel.enumclass.FontFamilyData

internal fun String?.mapFontFamily(): FontFamily? {
    return when (this) {
        FontFamilyData.Default.name -> FontFamily.Default
        FontFamilyData.SansSerif.name -> FontFamily.SansSerif
        FontFamilyData.Serif.name -> FontFamily.Serif
        FontFamilyData.Monospace.name -> FontFamily.Monospace
        FontFamilyData.Cursive.name -> FontFamily.Cursive
        else -> null
    }
}
