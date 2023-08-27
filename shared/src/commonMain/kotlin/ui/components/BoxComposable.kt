package ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import compose.foundation.layout.Box
import data.models.sdui.ActionData
import data.models.sdui.ComposableData
import ui.map.mapModifier

@Composable
fun BoxComposable(
    modifier: Modifier = Modifier,
    data: ComposableData.Box,
    onClick: (ActionData?) -> Unit
) {
    Box(modifier = data.modifier.mapModifier(modifier, onClick)) {
        data.content?.forEach {
            AppUiComposable(data = it, onClick = onClick)
        }
    }
}
