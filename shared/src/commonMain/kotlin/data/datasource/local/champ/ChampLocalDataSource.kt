package data.datasource.local.champ

import data.models.sdui.ComposableData

interface ChampLocalDataSource {

    fun getHome(): ComposableData
}
