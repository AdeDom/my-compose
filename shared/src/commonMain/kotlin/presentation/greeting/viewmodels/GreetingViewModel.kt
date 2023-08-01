package presentation.greeting.viewmodels

import base.BaseViewModel
import domain.usecases.greeting.GetGreetingUseCase
import kotlinx.coroutines.launch
import presentation.greeting.event.GreetingUiEvent
import presentation.greeting.state.GreetingUiState

class GreetingViewModel(
    private val greetingUseCase: GetGreetingUseCase
) : BaseViewModel<GreetingUiEvent, GreetingUiState>(GreetingUiState()) {

    override fun onEvent(event: GreetingUiEvent) {
        when (event) {
            GreetingUiEvent.Initial -> {
                viewModelScope.launch {
                    try {
                        emit {
                            copy(isLoading = true)
                        }
                        val result = greetingUseCase.execute()
                        emit {
                            copy(
                                isLoading = false,
                                title = result.title.orEmpty(),
                                subTitle = result.subTitle.orEmpty(),
                                age = result.age ?: 0,
                                imageUrl = result.imageUrl
                            )
                        }
                    } catch (e: Throwable) {
                        emit {
                            copy(isLoading = false)
                        }
                    }
                }
            }
        }
    }
}
