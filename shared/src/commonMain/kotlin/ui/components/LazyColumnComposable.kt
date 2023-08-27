package ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import data.models.sdui.ActionData
import data.models.sdui.ComposableData
import ui.map.mapModifier

@Composable
fun LazyColumnComposable(
    modifier: Modifier = Modifier,
    data: ComposableData.LazyColumn,
    onClick: (ActionData?) -> Unit
) {
    LazyColumn(modifier = data.modifier.mapModifier(modifier, onClick)) {
        items(data.itemContent ?: emptyList()) {
            AppUiComposable(data = it, onClick = onClick)
        }
    }
}
