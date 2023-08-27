package ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import data.models.sdui.ActionData
import data.models.sdui.ComposableData
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import ui.map.mapModifier
import ui.map.string.mapContentScale

@Composable
fun KamelImageComposable(
    modifier: Modifier = Modifier,
    data: ComposableData.KamelImage,
    onClick: (ActionData?) -> Unit
) {
    if (data.data != null) {
        KamelImage(
            resource = asyncPainterResource(data = data.data),
            contentDescription = data.contentDescription,
            contentScale = data.contentScale.mapContentScale(),
            modifier = data.modifier.mapModifier(modifier, onClick)
        )
    } else {
        Box(modifier = data.modifier.mapModifier(modifier, onClick))
    }
}
