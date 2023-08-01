package di

import data.datasource.local.platform.PlatformLocalDataSource
import data.datasource.local.platform.PlatformLocalDataSourceImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val androidModule = module {

    // data
    singleOf(::PlatformLocalDataSourceImpl) { bind<PlatformLocalDataSource>() }
}
