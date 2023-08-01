package ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import data.models.sdui.Component

@Composable
fun TextBlockComponent(
    modifier: Modifier = Modifier,
    component: Component.TextBlock
) {
    Text(
        text = component.text.orEmpty(),
        modifier = modifier
    )
}
