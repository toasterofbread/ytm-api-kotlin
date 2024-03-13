package dev.toastbits.ytmapi.endpoint

import com.toasterofbread.spmp.model.FilterChip
import dev.toastbits.ytmapi.model.external.mediaitem.layout.MediaItemLayout
import dev.toastbits.ytmapi.YoutubeApi

data class HomeFeedLoadResult(
    val layouts: List<MediaItemLayout>,
    val ctoken: String?,
    val filter_chips: List<FilterChip>?
)

abstract class HomeFeedEndpoint: YoutubeApi.Endpoint() {
    abstract suspend fun getHomeFeed(
        min_rows: Int = -1,
        allow_cached: Boolean = true,
        params: String? = null,
        continuation: String? = null
    ): Result<HomeFeedLoadResult>
}
