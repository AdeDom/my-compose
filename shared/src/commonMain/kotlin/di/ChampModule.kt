package di

import data.datasource.local.champ.ChampLocalDataSource
import data.datasource.local.champ.ChampLocalDataSourceImpl
import domain.usecases.champ.GetChampHomeUseCase
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val champModule = module {

    // data
    singleOf(::ChampLocalDataSourceImpl) { bind<ChampLocalDataSource>() }

    // domain
    singleOf(::GetChampHomeUseCase)
}
