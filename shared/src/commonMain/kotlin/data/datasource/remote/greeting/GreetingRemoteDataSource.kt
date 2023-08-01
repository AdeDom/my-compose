package data.datasource.remote.greeting

import data.models.greeting.GreetingResponse
import data.models.sdui.Component

interface GreetingRemoteDataSource {

    suspend fun getGreeting(): GreetingResponse

    suspend fun getSampleComponent(): Component
}
