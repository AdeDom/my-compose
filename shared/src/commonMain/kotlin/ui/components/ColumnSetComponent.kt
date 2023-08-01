package ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import data.models.sdui.Component

@Composable
fun ColumnSetComponent(
    modifier: Modifier = Modifier,
    component: Component.ColumnSet
) {
    Row(
        modifier = modifier
    ) {
        component.columns?.forEach { component ->
            AppUiComponent(component = component)
        }
    }
}
