package presentation.greeting.event

sealed interface GreetingUiEvent {
    data object Initial : GreetingUiEvent
}
