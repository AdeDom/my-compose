import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import domain.usecases.greeting.GetSampleComponentUseCase
import org.koin.compose.koinInject
import presentation.greeting.event.GreetingUiEvent
import presentation.greeting.viewmodels.GreetingViewModel
import ui.components.AppUiComponent

@Composable
fun App() {
    MaterialTheme {
        val sampleComponentUseCase = koinInject<GetSampleComponentUseCase>()
        val viewModel = getViewModel(
            Unit,
            viewModelFactory {
                GreetingViewModel(sampleComponentUseCase)
            }
        )
        val uiState = viewModel.uiState

        LaunchedEffect(Unit) {
            viewModel.onEvent(GreetingUiEvent.Initial)
        }

        Box(modifier = Modifier.fillMaxSize()) {
            uiState.component?.let { AppUiComponent(component = it) }

            if (uiState.isLoading) {
                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            }
        }
    }
}
