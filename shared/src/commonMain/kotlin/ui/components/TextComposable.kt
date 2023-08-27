package ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import data.models.sdui.ActionData
import data.models.sdui.ComposableData
import ui.map.int.mapFontSize
import ui.map.int.mapMaxLines
import ui.map.mapModifier
import ui.map.string.mapColor
import ui.map.string.mapFontFamily
import ui.map.string.mapFontStyle
import ui.map.string.mapFontWeight
import ui.map.string.mapOverflow
import ui.map.string.mapTextAlign

@Composable
fun TextComposable(
    modifier: Modifier = Modifier,
    data: ComposableData.Text,
    onClick: (ActionData?) -> Unit
) {
    Text(
        text = data.text.orEmpty(),
        modifier = data.modifier.mapModifier(modifier, onClick),
        color = data.color.mapColor(),
        fontSize = data.fontSize.mapFontSize(),
        fontStyle = data.fontStyle.mapFontStyle(),
        fontWeight = data.fontWeight.mapFontWeight(),
        fontFamily = data.fontFamily.mapFontFamily(),
        textAlign = data.textAlign.mapTextAlign(),
        overflow = data.overflow.mapOverflow(),
        maxLines = data.maxLines.mapMaxLines()
    )
}
