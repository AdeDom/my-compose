package ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import data.models.sdui.Component

@Composable
fun AppUiComponent(
    modifier: Modifier = Modifier,
    component: Component
) {
    when (component) {
        is Component.LazyColumn -> LazyColumnComponent(modifier, component)
        is Component.Column -> ColumnComponent(modifier, component)
        is Component.ColumnSet -> ColumnSetComponent(modifier, component)
        is Component.Container -> ContainerComponent(modifier, component)
        is Component.TextBlock -> TextBlockComponent(modifier, component)
        is Component.Image -> ImageComponent(modifier, component)
        Component.Unknown -> BoxComponent(modifier)
    }
}
