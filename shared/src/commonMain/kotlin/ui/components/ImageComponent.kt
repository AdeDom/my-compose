package ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import data.models.sdui.Component
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import ui.map.mapSize

@Composable
fun ImageComponent(
    modifier: Modifier = Modifier,
    component: Component.Image
) {
    Box(
        modifier = modifier.mapSize(component.width, component.height)
    ) {
        component.url?.let {
            KamelImage(
                asyncPainterResource(data = component.url),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
