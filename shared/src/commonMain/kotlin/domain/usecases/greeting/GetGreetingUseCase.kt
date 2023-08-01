package domain.usecases.greeting

import data.datasource.local.greeting.GreetingLocalDataSource
import data.datasource.local.platform.PlatformLocalDataSource

class GetGreetingUseCase(
    private val greetingLocalDataSource: GreetingLocalDataSource,
    private val platformLocalDataSource: PlatformLocalDataSource
) {

    fun execute(): String {
        return "${greetingLocalDataSource.getName()} - ${platformLocalDataSource.name}"
    }
}
