package presentation.greeting.event

import data.models.sdui.ActionData

sealed interface GreetingUiEvent {
    data object Initial : GreetingUiEvent
    data class OnClick(
        val action: ActionData?
    ) : GreetingUiEvent
}
