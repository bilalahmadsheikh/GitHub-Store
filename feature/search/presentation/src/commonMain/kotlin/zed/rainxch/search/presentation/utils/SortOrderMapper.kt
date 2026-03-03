package zed.rainxch.search.presentation.utils

import zed.rainxch.githubstore.core.presentation.res.*
import org.jetbrains.compose.resources.StringResource
import zed.rainxch.domain.model.SortOrder
import zed.rainxch.domain.model.SortOrder.*

fun SortOrder.label(): StringResource = when (this) {
    Descending -> Res.string.sort_order_descending
    Ascending -> Res.string.sort_order_ascending
}
