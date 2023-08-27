package presentation.sdui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import presentation.sdui.event.SduiUiEvent
import presentation.sdui.state.SduiUiState
import ui.components.AppUiComposable

@Composable
fun SduiContent(
    modifier: Modifier = Modifier,
    uiState: SduiUiState,
    onEvent: (SduiUiEvent) -> Unit
) {
    Box(modifier = modifier) {
        uiState.data?.let {
            AppUiComposable(
                data = it,
                onClick = { action ->
                    onEvent(SduiUiEvent.OnClick(action))
                }
            )
        }

        if (uiState.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
}
