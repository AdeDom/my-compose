package data.datasource.remote.default

import data.models.GreetingResponse

interface GreetingRemoteDataSource {

    suspend fun getGreeting(): GreetingResponse
}
