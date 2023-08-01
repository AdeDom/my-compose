package presentation.greeting.viewmodels

import base.BaseViewModel
import domain.usecases.greeting.GetSampleComponentUseCase
import kotlinx.coroutines.launch
import presentation.greeting.event.GreetingUiEvent
import presentation.greeting.state.GreetingUiState

class GreetingViewModel(
    private val getSampleComponentUseCase: GetSampleComponentUseCase
) : BaseViewModel<GreetingUiEvent, GreetingUiState>(GreetingUiState()) {

    override fun onEvent(event: GreetingUiEvent) {
        when (event) {
            GreetingUiEvent.Initial -> {
                viewModelScope.launch {
                    try {
                        emit {
                            copy(isLoading = true)
                        }
                        val result = getSampleComponentUseCase.execute()
                        emit {
                            copy(
                                isLoading = false,
                                component = result
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
