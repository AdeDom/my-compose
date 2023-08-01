package di

import data.datasource.local.greeting.GreetingLocalDataSource
import data.datasource.local.greeting.GreetingLocalDataSourceImpl
import domain.usecases.greeting.GetGreetingUseCase
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val greetingModule = module {

    // data
    singleOf(::GreetingLocalDataSourceImpl) { bind<GreetingLocalDataSource>() }

    // domain
    factoryOf(::GetGreetingUseCase)
}
