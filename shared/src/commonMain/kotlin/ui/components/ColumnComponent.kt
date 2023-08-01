package ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import data.models.sdui.Component

@Composable
fun ColumnComponent(
    modifier: Modifier = Modifier,
    component: Component.Column
) {
    Column(
        modifier = modifier
    ) {
        component.items?.forEach { component ->
            AppUiComponent(component = component)
        }
    }
}
