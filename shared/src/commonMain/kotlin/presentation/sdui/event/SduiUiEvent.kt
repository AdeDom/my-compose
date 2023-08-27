package presentation.sdui.event

import data.models.sdui.ActionData

sealed interface SduiUiEvent {
    data object Initial : SduiUiEvent
    data class OnClick(
        val action: ActionData?
    ) : SduiUiEvent
}
