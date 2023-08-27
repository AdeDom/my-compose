package presentation.sdui.viewmodel

import base.BaseViewModel
import data.models.sdui.ActionData
import domain.usecases.champ.GetChampHomeUseCase
import kotlinx.coroutines.launch
import presentation.sdui.event.SduiUiEvent
import presentation.sdui.state.SduiUiState
import utils.AppNavigation

class SduiViewModel(
    private val getChampHomeUseCase: GetChampHomeUseCase,
    private val appNavigation: AppNavigation
) : BaseViewModel<SduiUiEvent, SduiUiState>(SduiUiState()) {

    override fun onEvent(event: SduiUiEvent) {
        when (event) {
            SduiUiEvent.Initial -> {
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

            is SduiUiEvent.OnClick -> {
                when (event.action) {
                    is ActionData.Open -> {
                        appNavigation.openWebOrDeeplink(event.action.url)
                    }

                    ActionData.Unknown, null -> {}
                }
            }
        }
    }
}
