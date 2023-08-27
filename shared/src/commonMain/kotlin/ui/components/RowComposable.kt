package ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import compose.foundation.layout.Row
import data.models.sdui.ActionData
import data.models.sdui.ComposableData
import ui.map.datamodel.mapHorizontalArrangement
import ui.map.mapModifier
import ui.map.string.mapVerticalAlignment

@Composable
fun RowComposable(
    modifier: Modifier = Modifier,
    data: ComposableData.Row,
    onClick: (ActionData?) -> Unit
) {
    Row(
        modifier = data.modifier.mapModifier(modifier, onClick),
        horizontalArrangement = data.horizontalArrangement.mapHorizontalArrangement(),
        verticalAlignment = data.verticalAlignment.mapVerticalAlignment()
    ) {
        data.content?.forEach {
            AppUiComposable(data = it, onClick = onClick)
        }
    }
}
