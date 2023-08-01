package data.datasource.remote.default

import data.datasource.DataSourceProvider
import data.models.GreetingResponse
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
}
