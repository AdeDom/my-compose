package presentation.greeting.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import domain.usecases.greeting.GetGreetingUseCase
import kotlinx.coroutines.launch
import presentation.greeting.state.GreetingUiState

class GreetingViewModel(
    private val greetingUseCase: GetGreetingUseCase
) : ViewModel() {

    var uiState by mutableStateOf(GreetingUiState())
        private set

    fun getGreeting() {
        viewModelScope.launch {
            try {
                uiState = uiState.copy(
                    isLoading = true
                )
                val result = greetingUseCase.execute()
                uiState = uiState.copy(
                    isLoading = false,
                    title = result.title.orEmpty(),
                    subTitle = result.subTitle.orEmpty(),
                    age = result.age ?: 0,
                    imageUrl = result.imageUrl
                )
            } catch (e: Throwable) {
                uiState = uiState.copy(
                    isLoading = false
                )
            }
        }
    }
}
