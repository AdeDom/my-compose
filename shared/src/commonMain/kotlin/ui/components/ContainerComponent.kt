package ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import data.models.sdui.Component
import ui.map.mapColor
import ui.map.mapSize

@Composable
fun ContainerComponent(
    modifier: Modifier = Modifier,
    component: Component.Container
) {
    Box(
        modifier = modifier
            .mapSize(component.width, component.height)
            .mapColor(component.backgroundColor)
    ) {
        component.items?.forEach { component ->
            AppUiComponent(component = component)
        }
    }
}
