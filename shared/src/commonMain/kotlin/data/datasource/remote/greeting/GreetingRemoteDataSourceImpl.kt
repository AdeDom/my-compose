package data.datasource.remote.greeting

import data.datasource.DataSourceProvider
import data.models.greeting.GreetingResponse
import data.models.sdui.Component
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class GreetingRemoteDataSourceImpl(
    private val dataSourceProvider: DataSourceProvider,
    private val ioDispatcher: CoroutineDispatcher
) : GreetingRemoteDataSource {

    override suspend fun getGreeting(): GreetingResponse {
        return withContext(ioDispatcher) {
            dataSourceProvider.getHttpClient()
                .get("${dataSourceProvider.getBaseUrl()}v3/72295245-fc53-4893-96f5-262f193518c9")
                .body()
        }
    }

    override suspend fun getSampleComponent(): Component {
        return withContext(ioDispatcher) {
            dataSourceProvider.getHttpClient()
                .get("${dataSourceProvider.getBaseUrl()}v3/eb514559-5f40-4e8e-aab0-4d1798149db7")
                .body()
        }
    }
}
