package data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GreetingResponse(
    @SerialName("title") val title: String? = null,
    @SerialName("sub_title") val subTitle: String? = null,
    @SerialName("age") val age: Int? = null,
    @SerialName("image_url") val imageUrl: String? = null
)
