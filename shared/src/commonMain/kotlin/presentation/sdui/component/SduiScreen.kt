package presentation.sdui.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import presentation.sdui.event.SduiUiEvent
import presentation.sdui.viewmodel.SduiViewModel

@Composable
fun SduiScreen(
    modifier: Modifier = Modifier,
    viewModel: SduiViewModel
) {
    LaunchedEffect(Unit) {
        viewModel.onEvent(SduiUiEvent.Initial)
    }

    SduiContent(
        modifier = modifier,
        uiState = viewModel.uiState,
        onEvent = viewModel::onEvent
    )
}
