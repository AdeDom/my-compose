package ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import data.models.sdui.Component

@Composable
fun LazyColumnComponent(
    modifier: Modifier = Modifier,
    component: Component.LazyColumn
) {
    LazyColumn(modifier = modifier) {
        items(component.body ?: emptyList()) { component ->
            AppUiComponent(component = component)
        }
    }
}
