package ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import compose.foundation.layout.Column
import data.models.sdui.ActionData
import data.models.sdui.ComposableData
import ui.map.datamodel.mapVerticalArrangement
import ui.map.mapModifier
import ui.map.string.mapHorizontalAlignment

@Composable
fun ColumnComposable(
    modifier: Modifier = Modifier,
    data: ComposableData.Column,
    onClick: (ActionData?) -> Unit
) {
    Column(
        modifier = data.modifier.mapModifier(modifier, onClick),
        verticalArrangement = data.verticalArrangement.mapVerticalArrangement(),
        horizontalAlignment = data.horizontalAlignment.mapHorizontalAlignment()
    ) {
        data.content?.forEach {
            AppUiComposable(data = it, onClick = onClick)
        }
    }
}
