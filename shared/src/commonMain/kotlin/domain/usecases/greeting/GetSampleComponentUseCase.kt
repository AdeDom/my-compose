package domain.usecases.greeting

import data.datasource.remote.greeting.GreetingRemoteDataSource
import data.models.sdui.Component

class GetSampleComponentUseCase(
    private val greetingRemoteDataSource: GreetingRemoteDataSource
) {

    suspend fun execute(): Component {
        return greetingRemoteDataSource.getSampleComponent()
    }
}
