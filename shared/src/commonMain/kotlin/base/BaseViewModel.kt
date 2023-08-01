package base

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import dev.icerock.moko.mvvm.viewmodel.ViewModel

abstract class BaseViewModel<Event, State>(
    initialUiState: State
) : ViewModel() {

    var uiState by mutableStateOf(initialUiState)
        protected set

    protected fun emit(reducer: State.() -> State) {
        uiState = uiState.reducer()
    }

    abstract fun onEvent(event: Event)
}
