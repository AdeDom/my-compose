package domain.usecases.champ

import data.datasource.local.champ.ChampLocalDataSource
import data.models.sdui.ComposableData

class GetChampHomeUseCase(
    private val champLocalDataSource: ChampLocalDataSource
) {

    fun execute(): ComposableData {
        return champLocalDataSource.getHome()
    }
}
