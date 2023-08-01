package data.models.sdui

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface Component {

    @Serializable
    @SerialName("LazyColumn")
    data class LazyColumn(
        val body: List<Component>? = null
    ) : Component

    @Serializable
    @SerialName("Column")
    data class Column(
        val items: List<Component>? = null
    ) : Component

    @Serializable
    @SerialName("ColumnSet")
    data class ColumnSet(
        val columns: List<Component>? = null
    ) : Component

    @Serializable
    @SerialName("Container")
    data class Container(
        val items: List<Component>? = null,
        val backgroundColor: String? = null,
        val width: Int? = null,
        val height: Int? = null
    ) : Component

    @Serializable
    @SerialName("TextBlock")
    data class TextBlock(
        val text: String? = null
    ) : Component

    @Serializable
    @SerialName("Image")
    data class Image(
        val url: String? = null,
        val width: Int? = null,
        val height: Int? = null
    ) : Component

    @Serializable
    data object Unknown : Component
}
