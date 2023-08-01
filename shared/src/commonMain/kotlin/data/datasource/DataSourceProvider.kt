package data.datasource

import data.datasource.remote.engine.AppHttpClientEngine
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class DataSourceProvider(
    private val appHttpClientEngine: AppHttpClientEngine
) {

    fun getBaseUrl(): String {
        return "https://run.mocky.io/"
    }

    fun getHttpClient(): HttpClient {
        return HttpClient(appHttpClientEngine.getEngine()) {
            install(ContentNegotiation) {
                json(
                    Json {
                        ignoreUnknownKeys = true
                        isLenient = true
                    }
                )
            }
        }
    }
}
