package presentation.sdui.state

import data.models.sdui.ComposableData

data class SduiUiState(
    val isLoading: Boolean = false,
    val data: ComposableData? = null
)
