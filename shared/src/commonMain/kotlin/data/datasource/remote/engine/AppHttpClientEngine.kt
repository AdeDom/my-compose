package data.datasource.remote.engine

import io.ktor.client.engine.HttpClientEngine

interface AppHttpClientEngine {

    fun getEngine(): HttpClientEngine
}
