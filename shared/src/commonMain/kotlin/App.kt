import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory
import domain.usecases.champ.GetChampHomeUseCase
import org.koin.compose.koinInject
import presentation.sdui.component.SduiScreen
import presentation.sdui.viewmodel.SduiViewModel
import ui.theme.SduiTheme
import utils.AppNavigation

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean
) {
    SduiTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        val getChampHomeUseCase = koinInject<GetChampHomeUseCase>()
        val appNavigation = koinInject<AppNavigation>()
        SduiScreen(
            modifier = Modifier.fillMaxSize(),
            viewModel = getViewModel(
                Unit,
                viewModelFactory {
                    SduiViewModel(
                        getChampHomeUseCase = getChampHomeUseCase,
                        appNavigation = appNavigation
                    )
                }
            )
        )
    }
}
