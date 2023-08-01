package presentation.greeting.state

data class GreetingUiState(
    val isLoading: Boolean = false,
    val title: String = "",
    val subTitle: String = "",
    val age: Int = 0,
    val imageUrl: String? = null
)
