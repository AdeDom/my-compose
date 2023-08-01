package domain.usecases.greeting

import data.datasource.remote.default.GreetingRemoteDataSource
import domain.models.GreetingModel

class GetGreetingUseCase(
    private val greetingRemoteDataSource: GreetingRemoteDataSource
) {

    suspend fun execute(): GreetingModel {
        return greetingRemoteDataSource.getGreeting()
    }
}
