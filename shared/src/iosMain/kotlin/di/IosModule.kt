package di

import data.datasource.local.platform.PlatformLocalDataSource
import data.datasource.local.platform.PlatformLocalDataSourceImpl
import data.datasource.remote.engine.AppHttpClientEngine
import data.datasource.remote.engine.AppHttpClientEngineImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import utils.AppNavigation
import utils.AppNavigationImpl

val iosModule = module {

    // data
    singleOf(::AppHttpClientEngineImpl) { bind<AppHttpClientEngine>() }

    singleOf(::PlatformLocalDataSourceImpl) { bind<PlatformLocalDataSource>() }

    // utils
    singleOf(::AppNavigationImpl) { bind<AppNavigation>() }
}
