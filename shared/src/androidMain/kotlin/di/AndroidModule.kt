package di

import data.datasource.local.platform.PlatformLocalDataSource
import data.datasource.local.platform.PlatformLocalDataSourceImpl
import data.datasource.remote.engine.AppHttpClientEngine
import data.datasource.remote.engine.AppHttpClientEngineImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val androidModule = module {

    // data
    singleOf(::AppHttpClientEngineImpl) { bind<AppHttpClientEngine>() }

    singleOf(::PlatformLocalDataSourceImpl) { bind<PlatformLocalDataSource>() }
}
