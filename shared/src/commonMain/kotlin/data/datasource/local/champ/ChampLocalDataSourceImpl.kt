package data.datasource.local.champ

import data.models.sdui.ComposableData
import utils.JsonUtil

class ChampLocalDataSourceImpl : ChampLocalDataSource {

    override fun getHome(): ComposableData {
        val json = """

        """.trimIndent()

        return JsonUtil.getJson().decodeFromString(json)
    }
}
