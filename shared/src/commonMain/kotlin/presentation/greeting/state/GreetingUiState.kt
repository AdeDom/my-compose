package presentation.greeting.state

import data.models.sdui.Component

data class GreetingUiState(
    val isLoading: Boolean = false,
    val component: Component? = null
)
