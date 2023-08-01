package di

import data.datasource.local.greeting.GreetingLocalDataSource
import data.datasource.local.greeting.GreetingLocalDataSourceImpl
import data.datasource.remote.default.GreetingRemoteDataSource
import data.datasource.remote.default.GreetingRemoteDataSourceImpl
import domain.usecases.greeting.GetGreetingUseCase
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val greetingModule = module {

    // data

    // remote
    singleOf(::GreetingRemoteDataSourceImpl) { bind<GreetingRemoteDataSource>() }

    // local
    singleOf(::GreetingLocalDataSourceImpl) { bind<GreetingLocalDataSource>() }

    // domain
    factoryOf(::GetGreetingUseCase)
}
