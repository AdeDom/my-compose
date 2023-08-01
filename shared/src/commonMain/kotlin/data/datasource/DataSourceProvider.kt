package data.datasource

import data.datasource.remote.engine.AppHttpClientEngine
import data.models.sdui.Component
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

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
                        serializersModule = SerializersModule {
                            polymorphic(Component::class) {
                                subclass(Component.LazyColumn::class)
                                subclass(Component.Column::class)
                                subclass(Component.ColumnSet::class)
                                subclass(Component.Container::class)
                                subclass(Component.TextBlock::class)
                                subclass(Component.Image::class)
                                defaultDeserializer { Component.Unknown.serializer() }
                            }
                        }
                    }
                )
            }
        }
    }
}
