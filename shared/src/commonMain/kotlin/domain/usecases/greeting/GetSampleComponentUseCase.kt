package domain.usecases.greeting

import data.datasource.remote.greeting.GreetingRemoteDataSource
import data.models.sdui.ComposableData

class GetSampleComponentUseCase(
    private val greetingRemoteDataSource: GreetingRemoteDataSource
) {

    suspend fun execute(): ComposableData {
        return greetingRemoteDataSource.getSampleComponent()
    }
}
