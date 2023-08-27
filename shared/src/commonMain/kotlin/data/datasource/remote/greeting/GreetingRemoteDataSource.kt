package data.datasource.remote.greeting

import data.models.greeting.GreetingResponse
import data.models.sdui.ComposableData

interface GreetingRemoteDataSource {

    suspend fun getGreeting(): GreetingResponse

    suspend fun getSampleComponent(): ComposableData
}
