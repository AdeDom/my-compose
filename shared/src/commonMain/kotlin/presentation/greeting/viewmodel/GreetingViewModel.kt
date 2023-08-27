package presentation.greeting.viewmodel

import base.BaseViewModel
import domain.usecases.champ.GetChampHomeUseCase
import kotlinx.coroutines.launch
import presentation.greeting.event.GreetingUiEvent
import presentation.greeting.state.GreetingUiState

class GreetingViewModel(
    private val getChampHomeUseCase: GetChampHomeUseCase
) : BaseViewModel<GreetingUiEvent, GreetingUiState>(GreetingUiState()) {

    override fun onEvent(event: GreetingUiEvent) {
        when (event) {
            GreetingUiEvent.Initial -> {
                viewModelScope.launch {
                    try {
                        emit {
                            copy(isLoading = true)
                        }
                        val result = getChampHomeUseCase.execute()
                        emit {
                            copy(
                                isLoading = false,
                                data = result
                            )
                        }
                    } catch (e: Throwable) {
                        emit {
                            copy(isLoading = false)
                        }
                    }
                }
            }

            is GreetingUiEvent.OnClick -> {
                println("AdeDom :: ${event.action}")
            }
        }
    }
}
