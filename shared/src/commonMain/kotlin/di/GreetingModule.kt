package di

import data.datasource.local.greeting.GreetingLocalDataSource
import data.datasource.local.greeting.GreetingLocalDataSourceImpl
import data.datasource.remote.greeting.GreetingRemoteDataSource
import data.datasource.remote.greeting.GreetingRemoteDataSourceImpl
import domain.usecases.greeting.GetGreetingUseCase
import domain.usecases.greeting.GetSampleComponentUseCase
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
    factoryOf(::GetSampleComponentUseCase)
}
