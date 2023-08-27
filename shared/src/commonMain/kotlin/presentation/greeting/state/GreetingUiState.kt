package presentation.greeting.state

import data.models.sdui.ComposableData

data class GreetingUiState(
    val isLoading: Boolean = false,
    val data: ComposableData? = null
)
